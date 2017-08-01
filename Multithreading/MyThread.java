import java.util.concurrent.*;

public class MyThread extends Thread{
	@Override
	public void run(){
		System.out.println("This is a new Thread created by extending thread class.");
		
	}
}