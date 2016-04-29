package test.state;

import test.interfaces.TransformerState;

public class MoveState implements TransformerState {

    @Override
    public void action() {
        System.out.println("move");
    }
}
