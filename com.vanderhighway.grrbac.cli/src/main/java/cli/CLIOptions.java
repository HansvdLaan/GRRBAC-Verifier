package cli;

public class CLIOptions {

    private boolean delayUpdatePropagation;

    public CLIOptions(){
        this.delayUpdatePropagation = true;
    }

    public boolean isDelayUpdatePropagation() {
        return delayUpdatePropagation;
    }

    public void setDelayUpdatePropagation(boolean delayUpdatePropagation) {
        this.delayUpdatePropagation = delayUpdatePropagation;
    }
}
