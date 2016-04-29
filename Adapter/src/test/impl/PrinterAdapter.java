package test.impl;

import test.objects.Printer;
import test.interfaces.PageListPrinter;

import java.util.List;

public class PrinterAdapter implements PageListPrinter {

    private Printer printer = new Printer();

    @Override
    public void printList(List<String> printList) {
        for (String text: printList){
            printer.print(text);
        }
    }
}
