package cli;

import com.vanderhighway.grrbac.core.modifier.PolicyAutomaticModifier;
import com.vanderhighway.grrbac.core.modifier.PolicyModifier;
import com.vanderhighway.grrbac.core.validator.PolicyValidator;
import com.vanderhighway.grrbac.model.grrbac.model.ValidDay;
import com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;

import java.util.HashMap;
import java.util.Map;

public class CLIContainer {

    private static final CLIContainer instance = new CLIContainer();

    private AdvancedViatraQueryEngine engine;
    private PolicyModifier modifier;
    private PolicyAutomaticModifier automaticModifier;
    private PolicyValidator validator;
    private Resource model;
    private String indentation = "";
    private CLIOptions options;

    //Quick Hack to generate unique IDs.
    private Map<String, Integer> identifierMap;

    public AdvancedViatraQueryEngine getEngine() {
        return engine;
    }

    public void setEngine(AdvancedViatraQueryEngine engine) {
        this.engine = engine;
    }

    public PolicyModifier getModifier() {
        return modifier;
    }

    public void setModifier(PolicyModifier modifier) {
        this.modifier = modifier;
    }

    public PolicyAutomaticModifier getAutomaticModifier() {
        return automaticModifier;
    }

    public void setAutomaticModifier(PolicyAutomaticModifier automaticModifier) {
        this.automaticModifier = automaticModifier;
    }

    public PolicyValidator getValidator() {
        return validator;
    }

    public void setValidator(PolicyValidator validator) {
        this.validator = validator;
    }

    public Resource getModel() {
        return model;
    }

    public SiteAccessControlSystem getSystem() {
        return (SiteAccessControlSystem) getModel().getContents().get(0);
    }

    public void setModel(Resource model) {
        this.model = model;
    }

    private CLIContainer(){
        identifierMap = new HashMap<>();
        options = new CLIOptions();
    }

    public static CLIContainer getInstance(){
        return instance;
    }

    public EObject getElement(String name, Class type) throws ModelManipulationException {
        EObject element = this.model.getEObject(name);
        if(element == null) {
            throw new IllegalArgumentException("entity not found: " + name);
        }
        if(element.getClass().isAssignableFrom(type)) {
            throw new IllegalArgumentException("entity " + name + " is of type" + element.getClass().getSimpleName()
                    + " and not " + type.getSimpleName());
        }
        return element;
    }

    public String generateUniqueTemporalContextID(TemporalContext context, ValidDay validDay) {
        String key = context.getName() + "-" + validDay.getName();
        identifierMap.putIfAbsent(key, -1);
        identifierMap.put(key, identifierMap.get(key) + 1);
        return key + "_" + identifierMap.get(key);
    }

    public String getIndentation() {
        return this.indentation;
    }

    public String increaseIndentation() {
        this.indentation += "\t";
        return this.indentation;
    }

    public String decreaseIdentation() {

        this.indentation = this.indentation.substring(0, this.indentation.length() -1);
        return this.indentation;
    }

    public String setIdentation(String indentation) {
        this.indentation = indentation;
        return this.indentation;
    }

    public CLIOptions getOptions() {
        return options;
    }

}