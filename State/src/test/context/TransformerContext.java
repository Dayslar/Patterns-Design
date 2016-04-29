package test.context;

import test.interfaces.TransformerState;

public class TransformerContext implements TransformerState {

    private TransformerState state;

    @Override
    public void action() {
        this.state.action();
    }

    public void setState(TransformerState state) {
        this.state = state;
    }

    public TransformerState getState() {
        return state;
    }
}
