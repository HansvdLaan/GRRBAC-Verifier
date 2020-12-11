package com.vanderhighway.grrbac.core.validator;

import com.brein.time.timeintervals.indexes.IntervalTree;
import com.brein.time.timeintervals.intervals.IntegerInterval;
import com.vanderhighway.grrbac.model.grrbac.model.PolicyDependentAuthorizationConstraint;
import com.vanderhighway.grrbac.patterns.*;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.xtext.xbase.lib.Extension;

import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class PolicyValidator {


    @Extension
    private Logger logger = Logger.getLogger(PolicyValidator.class);

    protected AdvancedViatraQueryEngine engine;

    public PolicyValidator(final AdvancedViatraQueryEngine engine) {
        this.engine = engine;
    }

    public void addDefaultChangeListeners(AdvancedViatraQueryEngine engine, boolean fireNow) {
        TemporalRelationsUpdateListenerFactory.addALlUpdateListeners(engine, fireNow);
        ConstraintUpdateListenerFactory.addALlUpdateListeners(engine, fireNow);
        SmellsUpdateListenerFactory.addALlUpdateListeners(engine, fireNow);
    }

    public void addAllChangeListeners(AdvancedViatraQueryEngine engine, boolean fireNow) {
        addDefaultChangeListeners(engine, fireNow);
        AuthorizationRelationsUpdateListenerFactory.addALlUpdateListeners(engine, fireNow);
        ContextDependentConstraintsUpdateListenerFactory.addALlUpdateListeners(engine, fireNow);
    }

}
