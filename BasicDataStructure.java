import java.util.Arrays;
import java.util.*;
public class BasicDataStructure{

	public static void main(String[] args ){

		int[] simpleArray =  new int[10];

		String[] arrayInitilized = new String[]{"hello","World"};

		System.out.println("String arry componenet"+ arrayInitilized[0]);

//  In array is initilized automatically with value zero
		System.out.println("Int array elements "+ simpleArray[2]);

		Arrays.fill(simpleArray, -1);
//  now the entire array is filled with -1 value.
		System.out.println("Int array elements "+ simpleArray[2]);




		String myString =" Hello World";

		myString.trim();

		System.out.println("String length is "+ myString.length());

		System.out.println("String value is "+ myString);




		LinkedList linkedList = new LinkedList();

		linkedList.add("a");
		linkedList.add("b");


		linkedList.offer("c");

		System.out.println("front of list"+ linkedList.peek());


		LinkedList linkedList2 = new LinkedList<Integer>();


		linkedList2.add(2);
		linkedList2.add(3);



		System.out.println("front of list"+ linkedList2.peek());


	}


}