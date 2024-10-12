package com.addsubcs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Count {
    private Integer val;

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
}
