Listimport java.util.*;
// List contains ordered list of elements.
public class CollectionsTutorial{
List<String> arrayList =  new ArrayList<String>();

public void operationsOnList(List<String> arrayList){


// Iterate over the list.

	Iterator<String> it =  arrayList.iterator();

		System.out.println("Hell is Here");
	
	while(it.hasNext()){
	
		System.out.println(it.next());
	}

	arrayList.add("Added from function.");


}
// Map contains key,value pair 
Map<String,Queue> hashMap = new HashMap<String,Queue>();


public void operationsOnMap(HashMap<String, Queue> hashMap){



}
// There are three general-purpose Set implementations — HashSet, TreeSet, and LinkedHashSet.
Set<String> hashSet = new HashSet<String>();
public void operationsonHashSet(){
	hashSet.add("Khay");
	hashSet.add("Let");
	hashSet.add("The");
	hashSet.add("Devil");
	hashSet.add("sleeeep.");

	for(String s : hashSet){
		System.out.println(s);
	}
}

Set<String> linkedHashSet = new LinkedHashSet<String>();
public void operationsonLinkedHashSet(){
	linkedHashSet.add("Khay");
	linkedHashSet.add("Let");
	linkedHashSet.add("The");
	linkedHashSet.add("Devil");
	linkedHashSet.add("sleeeep.");

	for(String s : linkedHashSet){
		System.out.println(s);
	}
}


Set<String> treeSet = new TreeSet<String>();
public void operationsOnTreeSet(){
	treeSet.add("Khay");
	treeSet.add("Let");
	treeSet.add("The");
	treeSet.add("Devil");
	treeSet.add("sleeeep.");

	for(String s : treeSet){
		System.out.println(s);
	}
}
Hashtable<String,String> hashTable =  new Hashtable<String,String>();

public void operationsOnHashTable(Hashtable<String,String> hashTable){


}

}