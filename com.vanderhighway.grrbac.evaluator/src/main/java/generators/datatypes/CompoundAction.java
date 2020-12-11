package generators.datatypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompoundAction {

    private List<Action> actions;

    public CompoundAction() {}
    public CompoundAction(Action action) {
        this.actions = Collections.singletonList(action);
    }

    public CompoundAction(List<Action> actions) {
        this.actions = actions;
    }

    public CompoundAction(Action... actions) {
        this.actions = Arrays.asList(actions);
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }


}
