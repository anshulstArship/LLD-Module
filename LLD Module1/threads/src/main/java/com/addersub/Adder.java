package com.addersub;

import lombok.AllArgsConstructor;

import java.util.concurrent.locks.Lock;

@AllArgsConstructor
public class Adder implements Runnable{

    private Count count;
    private Lock lock;

    @Override
    public void run() {
        for(int i=1;i<=100000;i++){
            lock.lock();
            Integer val = count.getVal();
            count.setVal(val+i);
            lock.unlock();
        }

    }
}
