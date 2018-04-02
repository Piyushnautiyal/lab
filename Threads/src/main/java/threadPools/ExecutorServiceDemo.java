package threadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		ExecutorService executorService	= Executors.newFixedThreadPool(10); //Created executors of size 10
		
		for(int i=0;i<10;i++) {
			executorService.submit(new someRunnableTask());
		}
	}
}

class someRunnableTask implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}