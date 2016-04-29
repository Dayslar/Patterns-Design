package test;

import test.impl.PrinterAdapter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("text1");
        list.add("text2");
        list.add("text3");

        PrinterAdapter printerAdapter = new PrinterAdapter();
        printerAdapter.printList(list);
    }
}
