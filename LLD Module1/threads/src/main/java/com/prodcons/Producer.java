package com.prodcons;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.Queue;
import java.util.concurrent.Semaphore;

@AllArgsConstructor
public class Producer  implements Runnable{

    private String name;
    private Queue<FoodItem> queue;
    private Semaphore prod;
    private  Semaphore cons;

    @SneakyThrows
    @Override
    public void run() {
        while (true){
             prod.acquire();
              queue.add(new FoodItem());
              System.out.println("Produced Food. Available items "+queue.size());
              cons.release();
        }

    }
}
