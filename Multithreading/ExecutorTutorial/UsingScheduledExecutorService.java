import java.util.*;
import java.util.concurrent.*;


public class UsingScheduledExecutorService {

ScheduledExecutorService scheduledExecutorService;

private class MyRunnable implements Runnable{
	@Override
	public void run(){
		System.out.println("Hello ScheduledExecutorService  this runnable is scheduled to run every 5 seconds.");
	}
}
private class MyFixedTimeScheduledRunnable implements Runnable{
	@Override
	public void run(){
		System.out.println("Hello This runnable was scheduled to be run after 10 seconds ScheduledExecutorService. ");
	}
}
	public  UsingScheduledExecutorService(){
		System.out.println("Hello ScheduledExecutorService , this was scheduled to be printed after 10 seconds. ");

		scheduledExecutorService = Executors.newScheduledThreadPool(10);

// Different ways to delegate task for execution to an ExecutorSevice. No way of obtaining result for this runnable.
		scheduledExecutorService.scheduleAtFixedRate(new MyRunnable(),1000,5000,TimeUnit.MILLISECONDS);

// Using submit() method, that returns a Future object which can be used to find out if the runnable has finished executing.

		scheduledExecutorService.scheduledAtFixedTime(new MyFixedTimeScheduledRunnable(),1000,10000,TimeUnit.MILLISECONDS);

	}
}