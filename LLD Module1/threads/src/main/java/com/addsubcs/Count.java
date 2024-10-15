package com.addsubcs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@AllArgsConstructor
@Getter
@Setter
public class Count {
    private Integer val;
    private AtomicInteger value; // Synchronized data type-> Handle syn at its own and have its own methods

    public Count(Integer val){
        this.val=val;
    }


    public synchronized void increment(int val){
        /* Block level
        synchronized(this.val){
        this.val+=val;
         */
        this.val+=val;
    }
    public synchronized void decrement(int val){
        this.val-=val;
    }

    public void inc(Integer value){
        this.value.addAndGet(value);
    }
}
