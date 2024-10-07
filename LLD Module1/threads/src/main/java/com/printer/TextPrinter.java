package com.printer;

import java.util.concurrent.Callable;

public class TextPrinter implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Hello World";
    }
}
