import java.util.concurrent.*;
import java.util.*;


public class MyCallable implements Callable<String>{

@Override 
public String call() throws Exception{
	String helloMessage = "Hello from callable object.";
	System.out.println("Inside MyCallable call() method.");
	Thread.sleep(10000);
	return helloMessage;
}

public static void main(String[ ] args){
	ExecutorService es = Executors.newFixedThreadPool(2);

	Future future = es.submit(new MyCallable());
	// try{
		// System.out.println(future.get());
	// }catch(Exception e){
		// e.printStackTrace();
	// }

	System.out.println("Main thread waiting 10 seconds befor comming to this line due to future.get() method.");

	} 

}


