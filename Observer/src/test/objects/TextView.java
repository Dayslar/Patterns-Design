package test.objects;

import test.interfaces.PublisherActionListener;

public class TextView implements PublisherActionListener {

    @Override
    public void doAction(String message) {
        System.out.println(this.getClass().getSimpleName() + " " + message);
    }
}
