package com.Callable.Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ThrowingExceptionFromAThread {
    public static void main(String[] args) {
        
        Thread t1   = new Thread(new RunnableThread());
        t1.start();
        
        FutureTask<String> futureTask   = new FutureTask<>(new CallableTask());
        
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(futureTask);
        
        
    }
}

class RunnableThread implements Runnable{
    public void run() {
        throw new RuntimeException("Runnable task ecception");
    }
}

class CallableTask implements Callable<String>{
    
    public String call() throws Exception{
        throw new RuntimeException("Callable task ecception");
    }
}