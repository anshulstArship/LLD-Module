package com.printer;

public class NumberPrinterTest {
    public static void main(String[] args) {
        NumberPrinter obj = new NumberPrinter(100);
        for(int i=0;i<10;i++){
            NumberPrinter printer = new NumberPrinter(12);
            printer.start(); // create a new thread
            // non-blocking calls
        }

    }
}
