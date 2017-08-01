import java.util.*;
public class UsingStack{

	public void SimpleStackUse(){

		Stack <String> stack = new Stack<String>();

stack.push("1");
stack.push("2");
stack.push("3");

//look at top object ("3"), without taking it off the stack.    
Object objTop = stack.peek();

Object obj3 = stack.pop(); //the string "3" is at the top of the stack.
Object obj2 = stack.pop(); //the string "2" is at the top of the stack.
Object obj1 = stack.pop(); //the string "1" is at the top of the stack.   


System.out.println("ObjectTop "+ obj3+" 2nd top "+obj2);
	}

	public static void main(String [] args){

		new UsingStack().SimpleStackUse();
	}
}