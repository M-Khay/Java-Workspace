package collectionstutorial;
import java.util.*;



public class MapTutorial{

	Map hashMap = new HashMap<String , Integer>();

	public void operationsOnHashMap(){
		hashMap.put("first",1);
		hashMap.put("Second",2);
		hashMap.put("third",3);

		Collection values = hashMap.values();

		Set<String> keys = hashMap.keySet();

		Set completeMap = hashMap.entrySet();

		Iterator i = completeMap.iterator();

		while(i.hasNext()){
			Map.Entry<String,Integer> entry = (Map.Entry) i.next();

			String key = entry.getKey();

			Integer value = entry.getValue();

			System.out.println("Key : "+key+ " Value : "+value);

		}

		System.out.println("Printing only keys");
		for(String s : keys ){
			System.out.println("Key:" + s );
		}

		System.out.println("Printing only values");
		Iterator vi = values.iterator();

		while(vi.hasNext()){
			System.out.println("Value: "+vi.next());
		}
		// while ()

			}
}

Map<String,String> treeMap =  new TreeMap<String,String> ();

public void oprationsOnTreeMap(){

treeMap.put("K","KK");
treeMap.put("B","Blowing");
treeMap.put("W","WizKhalifa");

}

Map<String,String> linkedHashMap = new LinkedHashMap<String,String>();




/*
Method & Description
1 	

void clear()

Removes all mappings from this map.
2 	

Object clone()

Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned.
3 	

boolean containsKey(Object key)

Returns true if this map contains a mapping for the specified key.
4 	

boolean containsValue(Object value)

Returns true if this map maps one or more keys to the specified value.
5 	

Set entrySet()

Returns a collection view of the mappings contained in this map.
6 	

Object get(Object key)

Returns the value to which the specified key is mapped in this identity hash map, or null if the map contains no mapping for this key.
7 	

boolean isEmpty()

Returns true if this map contains no key-value mappings.
8 	

Set keySet()

Returns a set view of the keys contained in this map.
9 	

Object put(Object key, Object value)

Associates the specified value with the specified key in this map.
10 	

putAll(Map m)

Copies all of the mappings from the specified map to this map. These mappings will replace any mappings that this map had for any of the keys currently in the specified map.
11 	

Object remove(Object key)

Removes the mapping for this key from this map if present.
12 	

int size()

Returns the number of key-value mappings in this map.
13 	

Collection values()

Returns a collection view of the values contained in this map.
*/

