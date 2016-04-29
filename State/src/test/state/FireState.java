package test.state;

import test.interfaces.TransformerState;

public class FireState implements TransformerState {

    @Override
    public void action() {
        System.out.println("fire");
    }
}
