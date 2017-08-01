import java.util.concurrent;

public class ThreadsExample{

	public static void main(Stringp[] args){
		createSimpleThread();
	}

	public void createSimpleThread(){
		Thread a = new Thread(new Runnable(){
			@Override
			public void run(){
				System.out.println("Hello, Thread created and Runnable passed as anonymous class.");
			}
		});

		a.start();
	}
}
	
