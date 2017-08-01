import java.util.*;
import java.util.concurrent.*;

public class QueueTutorial{
    BlockingQueue<Integer> supplierBlockingQueue = new ArrayBlockingQueue<>(3);
    public void startThreadToOperateOnQueue(){
    Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                operationsOnSupplierBlockingQueue();
            }
        });
    t2.start();

    Thread t3 = new Thread(new Runnable(){
            @Override
            public void run(){
                consumerTopOfQueue();
            }
        });
    try{
      Thread.sleep(10000);
    }catch(InterruptedException e){
    
    }
    t3.start();
    }
    public void operationsOnSupplierBlockingQueue(){

        supplierBlockingQueue.add(1);
        supplierBlockingQueue.add(2);
        supplierBlockingQueue.add(3);
    try{
        System.out.println("Trying to add 4th element in a ArrayBlockingQueue of size 3 result : ");
        supplierBlockingQueue.put(4);
    }catch(InterruptedException e){

    }catch(IllegalStateException e){

    }
    System.out.println("Now did the queue inserted the 4 element "+ supplierBlockingQueue.remainingCapacity());





}

public void consumerTopOfQueue(){

    System.out.println("Remove top element"+ supplierBlockingQueue.poll());
 try{
 Thread.sleep(10000);
}catch(InterruptedException e){

}   
        System.out.println("Now did the queue inserted the 4 element "+ supplierBlockingQueue.remainingCapacity());
}




final SynchronousQueue<String> queue = new SynchronousQueue<String>();
public void operationOnSynchronousQueue(){
        Thread producer = new Thread("PRODUCER") {
            public void run() {
                String event = "FOUR";
                try {
                    queue.put(event); // thread will block here
                    System.out.printf("[%s] published event : %s %n", Thread
                            .currentThread().getName(), event);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        producer.start(); // starting publisher thread

        Thread consumer = new Thread("CONSUMER") {
            public void run() {
                try {
                    String event = queue.take(); // thread will block here
                    System.out.printf("[%s] consumed event : %s %n", Thread
                            .currentThread().getName(), event);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        consumer.start(); // starting consu
}

public void queueWithMixedObjects(){
    Queue supplierQueue = new LinkedList();

    supplierQueue.add(1);

    supplierQueue.add("1 as string");

    System.out.println(supplierQueue.remove());
    System.out.println(supplierQueue.remove());
        

}
}
