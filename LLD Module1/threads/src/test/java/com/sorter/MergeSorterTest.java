package com.sorter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorterTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = new ArrayList<>(List.of(10,9,8,7,1,2,3,4));

        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter sorter = new MergeSorter(list,executorService);
        Future<List<Integer>> sortedList = executorService.submit(sorter);
        System.out.println(sortedList.get());
    }
}
