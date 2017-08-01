import java.util.concurrent.*;

public class ThreadExample{

	public static void main(String[] args){

		MyThread myThread= new MyThread();
		
		myThread.start();

		Thread a = new ThreadExample().createSimpleThread();
		a.start();
		
		System.out.println("Main program continuing, while the new thread creted is in paused state..");
		
		try{
			a.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("Main program stopped until the runnable thread has came back..");

	}

	public Thread createSimpleThread(){
		Thread a = new Thread(new Runnable(){
			@Override
			public void run(){

				System.out.println("Hello, Thread created and Runnable passed as anonymous class.");
				try{
					Thread.sleep(4000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		});
		return a;
		
		// When you call run, it run the runnable on the same thread. 
		// To run the runnable on its own thread you need to call start() method like above.
		
		// a.run();
	}



}
	
