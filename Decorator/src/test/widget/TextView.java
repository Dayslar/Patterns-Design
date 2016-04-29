package test.widget;

public class TextView implements Component {

    @Override
    public void draw() {
        System.out.println("TextView draw");
    }

    @Override
    public String toString() {
        return "TextView";
    }
}
