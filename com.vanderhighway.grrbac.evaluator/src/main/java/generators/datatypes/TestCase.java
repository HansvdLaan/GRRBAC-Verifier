package generators.datatypes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestCase {

    private String name;
    private List<CompoundAction> compoundActions;

    public TestCase() {
        compoundActions = new LinkedList<>();
    }

    public TestCase(String name, List<CompoundAction> compoundActions) {
        this.name = name;
        this.compoundActions = compoundActions;
    }

    public TestCase(String name, CompoundAction compoundAction) {
        this.name = name;
        this.compoundActions = Collections.singletonList(compoundAction);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CompoundAction> getCompoundActions() {
        return compoundActions;
    }

    public void setCompoundActions(List<CompoundAction> compoundActions) {
        this.compoundActions = compoundActions;
    }

}
