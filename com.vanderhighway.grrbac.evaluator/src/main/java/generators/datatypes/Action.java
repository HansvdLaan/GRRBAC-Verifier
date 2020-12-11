package generators.datatypes;

import java.util.List;

public class Action {

    private ActionType type;
    private List<String> parameters;

    public Action() {

    }

    public Action(ActionType type, List<String> parameters) {
        this.type = type;
        this.parameters = parameters;
    }

    public ActionType getType() {
        return type;
    }

    public void setType(ActionType type) {
        this.type = type;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return type + ":" + parameters;
    }
}
