package com.printer;

import java.util.concurrent.*;

public class TextPrinterTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        TextPrinter printer = new TextPrinter();
        Future<String> future = executor.submit(printer);
        System.out.println("Not blocked");
        System.out.println(future.get()); // blocked call

    }
}
