import java.util.*;
// List contains ordered list of elements.
public class SetTutorial{
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

	Iterator<String> it = linkedHashSet.interator();

	while(it.hashNext()){
		System.out.println(it.next());
	}

}

class ValueComparator  implements Comparator<Integer>{
// Ive defined my valueComparator to use the reverse order of elements. 
	@Override
	public int compare(Integer a, Integer b){
		if(a>b)return -1;
		else return 1;
	}
}

Set<Integer> treeSet = new TreeSet<Integer>(new ValueComparator());
public void operationsOnTreeSet(){
	treeSet.add(1);
	treeSet.add(2);
	treeSet.add(5);
	treeSet.add(4);
	treeSet.add(3);

	for(Integer s : treeSet){
		System.out.println(""+s);
	}
}


}