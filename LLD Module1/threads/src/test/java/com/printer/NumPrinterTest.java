package com.printer;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class NumPrinterTest {
    public static void main(String[] args) {
//       for(int i=0;i<100;i++){
//           NumPrinter printer = new NumPrinter(10);
//           Thread thread = new Thread(printer);
//           thread.start();
//       }

        Executor executor = Executors.newFixedThreadPool(5);
       for(int i=0;i<100;i++){
           NumPrinter printer1 = new NumPrinter(100);
           executor.execute(printer1);
       }

    }
}
