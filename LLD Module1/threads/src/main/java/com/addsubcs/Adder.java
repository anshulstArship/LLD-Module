package com.addsubcs;

import lombok.AllArgsConstructor;

import java.util.concurrent.locks.Lock;

@AllArgsConstructor
public class Adder implements Runnable{

    private Count count;


    @Override
    public void run() {
        for(int i=1;i<=100000;i++){

            count.increment(i);

        }

    }
}
