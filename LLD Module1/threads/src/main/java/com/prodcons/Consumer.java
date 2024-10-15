package com.prodcons;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.Queue;
import java.util.concurrent.Semaphore;

@AllArgsConstructor
public class Consumer implements Runnable{

    private String name;
    private Queue<FoodItem> queue;
    private Semaphore prod;
    private  Semaphore cons;
    @SneakyThrows
    @Override
    public void run() {
        while (true){
                cons.acquire();
                queue.remove();
                System.out.println("Consumed Food. Available items "+queue.size());
                prod.release();

        }

    }
}
