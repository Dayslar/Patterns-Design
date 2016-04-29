package test.decorators;

import test.widget.Component;

public abstract class Decorator implements Component {

    protected  Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public abstract void afterDraw();

    public void draw(){
        component.draw();
        afterDraw();
    }

}
