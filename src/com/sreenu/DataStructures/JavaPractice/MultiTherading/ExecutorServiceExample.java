package com.sreenu.DataStructures.JavaPractice.MultiTherading;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by SreenUNaik on 01-Mar-21.
 * Problem :
 * Time Complexity :
 * Space Complexity :
 */
public class ExecutorServiceExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(myRunnable("Task1"));
        executorService.execute(myRunnable("Task2"));
        executorService.execute(myRunnable("Task3"));
        Future future = executorService.submit(myRunnable("Task4_Future"));
        Future callale_future = executorService.submit(myCallable("Task5_Callale_Future"));
        System.out.println("FutureDone::"+future.isDone());
        System.out.println(future.get());
        System.out.println("FutureDone::"+future.isDone());
        System.out.println("callableFutureDone::"+callale_future.isDone());
        System.out.println("callableGet response::"+callale_future.get());
        System.out.println("callableFutureDone::"+callale_future.isDone());

        List<Callable<String>> callables = new ArrayList<>();
        callables.add(myCallable("Task1.1"));
        callables.add(myCallable("Task1.2"));
        callables.add(myCallable("Task1.3"));
        try {
            String result = (String) executorService.invokeAny((Collection)callables);
            System.out.println("InvokeAny_Result:"+result);
            List<Future<String>> futures = executorService.invokeAll((Collection)callables);
            for (Future f :futures
                    ) {
                System.out.println("Futures::"+f.get());
            }
        }catch (Exception e){}
        executorService.shutdown();
    }
    private static Runnable myRunnable(String msg){
        return ()->{
            System.out.println(Thread.currentThread().getName()+"::"+msg);
        };
    }
    private static Callable myCallable(String msg){
        return ()->{
            return Thread.currentThread().getName()+"::"+msg;
        };
    }
}
