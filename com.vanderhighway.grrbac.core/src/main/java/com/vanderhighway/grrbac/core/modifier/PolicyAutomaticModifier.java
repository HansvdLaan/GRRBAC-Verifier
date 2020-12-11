package com.vanderhighway.grrbac.core.modifier;

import com.brein.time.timeintervals.collections.ListIntervalCollection;
import com.brein.time.timeintervals.indexes.IntervalTree;
import com.brein.time.timeintervals.indexes.IntervalTreeBuilder;
import com.brein.time.timeintervals.intervals.IntegerInterval;
import com.google.common.base.Objects;

import com.vanderhighway.grrbac.core.validator.PolicyValidator;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import com.vanderhighway.grrbac.patterns.TimeRangeP;

import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.transformation.evm.specific.Lifecycles;
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations;
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule;
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory;
import org.eclipse.viatra.transformation.runtime.emf.transformation.eventdriven.EventDrivenTransformation;
import org.eclipse.xtext.xbase.lib.Extension;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

public class PolicyAutomaticModifier {

    @Extension
    private Logger logger = Logger.getLogger(PolicyValidator.class);

    @Extension
    private final GRRBACPackage ePackage = GRRBACPackage.eINSTANCE;

    @Extension //Transformation-related extensions
    private EventDrivenTransformation transformation;

    @Extension //Transformation rule-related extensions
    private EventDrivenTransformationRuleFactory _eventDrivenTransformationRuleFactory = new EventDrivenTransformationRuleFactory();

    private final AdvancedViatraQueryEngine engine;
    private final PolicyModifier policyModifier;
    Map<String,IntervalTree> trees;

    public PolicyAutomaticModifier(AdvancedViatraQueryEngine engine, PolicyModifier policyModifier, SiteAccessControlSystem system) {
        this.engine = engine;
        this.policyModifier = policyModifier;
        this.trees = new HashMap<>();

        if(system.getContextContainer().getValidDays() != null) {
            for (ValidDay validDay : system.getContextContainer().getValidDays()) {
                IntervalTree tree = IntervalTreeBuilder.newBuilder()
                        .usePredefinedType(IntervalTreeBuilder.IntervalType.LONG)
                        .collectIntervals(interval -> new ListIntervalCollection())
                        .build();
                tree.add(new IntegerInterval(0, 1439));
                this.trees.put(validDay.getName(), tree);
            }
        }
    }

    public void initialize() throws InvocationTargetException {
        this.logger.info("Preparing transformation rules.");
        //this.policyModifier.execute(com.vanderhighway.grrbac.core.modifier.IntervalUtil.addAllAlwaysRanges(policyModifier, this.tree));
        this.transformation = createTransformation();
        this.logger.info("Prepared transformation rules");
    }

    public void execute() {
        this.logger.debug("Executing transformations");
        this.transformation.getExecutionSchema().startUnscheduledExecution();
    }

    private EventDrivenTransformation createTransformation() throws InvocationTargetException {
        EventDrivenTransformation transformation = null;
        transformation = EventDrivenTransformation.forEngine(this.engine)
                .addRule(this.ProcessTimeRangeModifications())
                .build();
        return transformation;
    }

    public void dispose() {
        if (!Objects.equal(this.transformation, null)) {
            this.transformation.dispose();
        }
        this.transformation = null;
    }

    private EventDrivenTransformationRule<TimeRangeP.Match, TimeRangeP.Matcher> ProcessTimeRangeModifications() throws InvocationTargetException {
        return engine.delayUpdatePropagation( () -> this._eventDrivenTransformationRuleFactory.createRule(TimeRangeP.instance()).action(
                CRUDActivationStateEnum.CREATED, (TimeRangeP.Match it) -> {
                    try {
                        IntervalTree tree = trees.get(it.getInstance().getValidDay().getName());

                        if(tree == null) {
                            tree = IntervalTreeBuilder.newBuilder()
                                    .usePredefinedType(IntervalTreeBuilder.IntervalType.LONG)
                                    .collectIntervals(interval -> new ListIntervalCollection())
                                    .build();
                            tree.add(new IntegerInterval(0, 1439));
                            this.trees.put(it.getInstance().getValidDay().getName(), tree);
                        }
                        //Check if the match hasn't been processed before, e.g. in
                        // the case of the always day schedule time ranges.
                        if(it.getInstance().getValidDayTimeRanges().size() == 0) {
                            IntervalUtil.processAddRange(this.policyModifier, tree, it);
                        }
                    } catch (ModelManipulationException e) {
                        e.printStackTrace();
                    }
                }).action(
                CRUDActivationStateEnum.UPDATED, (TimeRangeP.Match it) -> {
                }).action(
                    CRUDActivationStateEnum.DELETED, (TimeRangeP.Match it) -> {
                        try {
                            IntervalTree tree = trees.get(it.getInstance().getValidDay().getName());
                            IntervalUtil.processRemoveRange(this.policyModifier, tree, it);
                        } catch (ModelManipulationException e) {
                            e.printStackTrace();
                        }
                    })
                .addLifeCycle(Lifecycles.getDefault(false, true))
                .name("process-day-ranges").build());
    }

    public EventDrivenTransformation getTransformation() {
        return transformation;
    }
}
