package test;

import test.decorators.BorderDecorator;
import test.decorators.ColorDecorator;
import test.widget.Component;
import test.widget.TextView;

public class Start {

    public static void main(String[] args) {

        Component textView = new TextView();
        textView.draw();
        System.out.println();

        Component withBorder = new ColorDecorator(new BorderDecorator(textView));
        withBorder.draw();
    }
}
