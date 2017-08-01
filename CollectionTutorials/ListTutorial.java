package collectionstutorial;
import java.util.*;

public class ListTutorial{

List arrayList =  new ArrayList<String>();

public void operationsOnList(List arrayList){



// Iterate over the list.

	Iterator<String> it =  arrayList.iterator();

	while(it.hasNext()){
	
		System.out.println(it.next());
	}

	arrayList.add("Added from function Original size was 4 new size \n.");


}

public void operationsOnLinkedList(){
LinkedList linkedList = new LinkedList<String>();

	linkedList.add("first");
	linkedList.add("Three");
	linkedList.add("2");


System.out.println(""+	linkedList.getFirst());
System.out.println(linkedList.getLast());
System.out.println(linkedList.get(1));
linkedList.addFirst("2");
System.out.println(""+	linkedList.getFirst());

linkedList.add(4,"Fourth element");
System.out.println(linkedList.getLast());

try{
linkedList.add(10, "Tenth element, but should give index out of bound exception");
}catch(IndexOutOfBoundsException e){
	e.printStackTrace();
}
}


public void listWithMixedTypesObjects(){

	ArrayList list = new ArrayList();
list.add("somethingold");
list.add(3);
list.add("somethingnew");
list.add(5);

System.out.println(list.get(0));
System.out.println(list.get(1));

}


}
