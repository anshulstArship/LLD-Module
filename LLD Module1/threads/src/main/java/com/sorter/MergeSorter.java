package com.sorter;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@AllArgsConstructor
public class MergeSorter implements Callable<List<Integer>> {

    private List<Integer> list = new ArrayList<>() ;
    private ExecutorService executor ;

    @Override
    public List<Integer> call() throws ExecutionException, InterruptedException {
        if(list.size()<=1){
            return list;
        }
        int mid = list.size()/2;
        List<Integer> left = list.subList(0,mid);
        List<Integer> right = list.subList(mid,list.size());

        MergeSorter leftSorter = new MergeSorter(left,executor);
        MergeSorter rightSorter = new MergeSorter(right,executor);

        Future<List<Integer>> leftFuture = executor.submit(leftSorter);// creating a new thread
        Future<List<Integer>> rightFuture = executor.submit(rightSorter);

        return merge(leftFuture,rightFuture);
    }

    private List<Integer> merge(Future<List<Integer>> leftFuture, Future<List<Integer>> rightFuture) throws ExecutionException, InterruptedException {
        List<Integer> result = new ArrayList<>();
        int i=0;
        int j=0;
        List<Integer> left = leftFuture.get();
        List<Integer> right = rightFuture.get();

        while(i<left.size() && j<right.size()){
            if(left.get(i)<=right.get(j)){
                result.add(left.get(i));
                i++;
            }else{
                result.add(right.get(j));
                j++;
            }
        }
        while(i<left.size()){
            result.add(left.get(i));
            i++;
        }
        while (j<right.size()){
            result.add(right.get(j));
            j++;
        }
        return result;
    }
}
