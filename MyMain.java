import java.util.*;
import mygenerics.*;
import collectionsTutorial.*;


public class MyMain{

public static void main (String[ ] args){
SetTutorial st =  new SetTutorial();

System.out.println("\t \tCollections Framework and their use ");
System.out.println("----------------------------------------------------------------------------------");




System.out.println("A.) Set ");


// No Oder is maintained here.

System.out.println("\t\t 1.Operations on HashSet");

st.operationsonHashSet();

System.out.println("---------------------------------------------------------------------");

System.out.println("\t\t2.Operations On LinkedHashSet");
st.operationsonLinkedHashSet();

System.out.println("---------------------------------------------------------------------");

System.out.println("\t\t 3.Operations on TreeSet");
st.operationsOnTreeSet();

System.out.println("---------------------------------------------------------------------------------");


System.out.println("b.) List ");



ListTutorial lt = new ListTutorial();

 List<String> arrayList =  new ArrayList<String>();

arrayList.add("Khay");
arrayList.add("is");
arrayList.add("what is");
arrayList.add("ULTIMATE");

System.out.println("\t\t 1.Operations on ArrayList");
lt.operationsOnList(arrayList);
System.out.println(arrayList.size());
 // if the length is 5 that means array list is pass by reference.

System.out.println("---------------------------------------------------------------------");

System.out.println("\t\t  2.Operations on LinkedList");
lt.operationsOnLinkedList();

System.out.println("---------------------------------------------------------------------");

System.out.println("\t\t  3.Operations on mixed type of array list");
lt.listWithMixedTypesObjects();
System.out.println("---------------------------------------------------------------------------------");

System.out.println("c.) Map ");


System.out.println("\t\t 3. Operations on HashMap");

System.out.println("---------------------------------------------------------------------");



// MapTutorial mt =  new MapTutorial();

// mt.operationsOnHashMap();

System.out.println("D.) Queue ");

System.out.println("\t\t 3. Operations on ArrayBlockingQueue");

System.out.println("---------------------------------------------------------------------");

QueueTutorial queueTutorial =  new QueueTutorial();
System.out.println("\t\t 4. Operations on Synchronousqueue");

queueTutorial.startThreadToOperateOnQueue();
queueTutorial.operationOnSynchronousQueue();

System.out.println("\t\t 5. Operations on Queue with mixed objects ");

queueTutorial.queueWithMixedObjects();

System.out.println("D.) Generic Programming");

System.out.println("---------------------------------------------------------------------------------");

System.out.println("\t\t 3. Generic Class example ");

GenericProgrammingTutorial<String> generic =  new GenericProgrammingTutorial<>();
generic.set("KK Blowing");
generic.printObject();
System.out.println("---------------------------------------------------------------------");

}

}


// Map contains key,value pair 
// Map<String,Queue> hashMap = new HashMap<String,Queue>();


// public void operationsOnMap(HashMap<String, Queue> hashMap){



// }