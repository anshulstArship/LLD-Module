package com.prodcons;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Runner {
    public static void main(String[] args) {
        Queue<FoodItem> queue = new ArrayDeque<>();
        int maxSize=4;

        Semaphore pro = new Semaphore(4);
        Semaphore con = new Semaphore(0);

        Producer p1 = new Producer("p1",queue,pro,con);
        Producer p2 = new Producer("p2",queue,pro,con);
        Producer p3 = new Producer("p3",queue,pro,con);
        Producer p4 = new Producer("p5",queue,pro,con);

        Consumer c1 = new Consumer("c1",queue,pro,con);
        Consumer c2 = new Consumer("c2",queue,pro,con);
        Consumer c3 = new Consumer("c3",queue,pro,con);
        Consumer c4 = new Consumer("c4",queue,pro,con);

        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(p4).start();
        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
        new Thread(c4).start();
    }
}
