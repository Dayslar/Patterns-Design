package test.widget;

public class Butoon implements Component {

    @Override
    public void draw() {
        System.out.println("Button draw");
    }

    @Override
    public String toString() {
        return "Butoon";
    }
}
