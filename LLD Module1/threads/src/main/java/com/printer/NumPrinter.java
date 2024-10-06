package com.printer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class NumPrinter implements Runnable{
    private Integer number;

    @Override
    public void run() {
        System.out.println("Number "+number+" printed by thread "+Thread.currentThread().getName());



    }
}
