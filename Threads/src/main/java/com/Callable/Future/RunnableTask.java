package com.Callable.Future;

public class RunnableTask implements Runnable {
    public void run() {
        throw new RuntimeException("Runnable task ecception");
    }
}
