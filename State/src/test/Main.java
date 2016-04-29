package test;

import test.context.TransformerContext;
import test.interfaces.TransformerState;
import test.state.FireState;
import test.state.MoveState;

public class Main {

    public static void main(String[] args) {
        TransformerContext transformerState = new TransformerContext();


        TransformerState moveState = new MoveState();
        TransformerState fireState = new FireState();

        transformerState.setState(moveState);
        transformerState.action();

        transformerState.setState(fireState);
        transformerState.action();

    }
}
