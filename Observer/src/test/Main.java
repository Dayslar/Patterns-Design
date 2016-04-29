package test;

import test.interfaces.PublisherActionListener;
import test.objects.Button;
import test.objects.Publisher;
import test.objects.TextView;

public class Main {

    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        PublisherActionListener button = new Button();
        publisher.addListener(button);

        PublisherActionListener textView = new TextView();
        publisher.addListener(textView);

        publisher.createNewMessage("нажат(а)");
    }
}
