` import java.util.*;
 import java.util.concurrent.*;

 public class UsingExecutorService{

class MyRunnable implements Runnable{
	@Override
	public void run(){
		System.out.println("Hello ExecutorService ");
		}
	}

	ExecutorService executorService;

	public void UsingMyExecutorService(){
		executorService = Executors.newFixedThreadPool(10);

// Different ways to delegate task for execution to an ExecutorSevice. No way of obtaining result for this runnable.
		executorService.execute(new MyRunnable());

// Using submit() method, that returns a Future object which can be used to find out if the runnable has finished executing.
		Future future = executorService.submit(new MyRunnable());
		try{
			future.get(); // returns null if the task has finished correctly.
		}catch(InterruptedException e){
			e.printStackTrace();
		}catch(ExecutionException p){
			p.printStackTrace();
		}



	}
}
