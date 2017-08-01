
package mygenerics;
// This is a generic class

public class GenericProgrammingTutorial<T,P,S>{


private T t;
 public void printObject(){
 	System.out.println("Object os "+t);

 }

public void set(T value){
	this.t =  value;
}
public T get(){
	return t;
}

public <S> void printSecondTypeObject(S object2){
	System.out.println("object2 "+object2);
}


public static void Main(String[] args){


}


// How to use <? extends E > vs <? super E >  
// producer --> extends 
// consumer --> super

// Examples:
public void setValue(Collection<? super P>){	

}

public P getValue(Collection<? extends P>){

}


}
