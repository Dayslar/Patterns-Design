package test.decorators;

import test.widget.Component;

public class ColorDecorator extends Decorator{

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.print(" - add color");
    }
}
