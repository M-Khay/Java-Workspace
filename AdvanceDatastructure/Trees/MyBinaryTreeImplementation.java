
public class MyTreeImplementation<T>{


	private class Node <T>{
		T key;
		Node<T> leftChild;
		Node<T> rightChild;
	}

private transient Node<T> header =  new Node<T>(null, null, null);


public MyBinaryTreeImplementation(){
	header.leftChild = header.rightChild= header;
}
public boolean add(T element){

	addNode(element,header);

}

public Node addNode(element value,Node header){

Node newNode = new Node();

	if(header==null){

		return newNode;
	}
	if(header.rigthChild ==null){
		header.rightChild = addNode(newNode, header.rightChild);
	
	}else{
		header.leftChild = addNode(newNode, header.leftChild);
	
	}

}





}