package com.printer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class NumberPrinter extends Thread{
    private Integer number;

    void print(){
        System.out.println("Number "+number+" printed by thread "+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Number "+number+" printed by thread "+Thread.currentThread().getName());
    }
}
