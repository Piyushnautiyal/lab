package threadPools;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {

	public static void main(String[] args) throws Exception {
		ExecutorService exService = Executors.newCachedThreadPool();
		
		for(int i=0;i<100;i++) {
			SomeCallableTask someRunnableTask	= new SomeCallableTask();
			System.out.println(exService.submit(someRunnableTask).get());
		}
		exService.shutdown();
	}
}

class SomeCallableTask implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return "Piyush";
	}
	
}
