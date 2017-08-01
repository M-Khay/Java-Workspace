import java.util.Random;
public class MyBinarySearchTreeImplementation{

	private class Node{
		int key;
		Node leftChild;
		Node rightChild;
	}

 static  Node mainHeader;


public MyBinarySearchTreeImplementation(){
	mainHeader = new Node();
	mainHeader.key= 0;
	mainHeader.leftChild = mainHeader.rightChild= null;
	
}
public Node add(int element){
	Node newNode = new Node();
	newNode.key =  element;
	newNode.leftChild= null;
	newNode.rightChild = null;

	addNode(newNode,mainHeader);
	return newNode;

}

public Node addNode(Node newNode,Node header){
//	if(header==null){
//		header= newNode;
//		return newNode;
//	}
	if(newNode.key > header.key){
		header.rightChild = addNode(newNode, header.rightChild);
	
	}else{
		header.leftChild = addNode(newNode, header.leftChild);
	
	}
	return newNode;
}

public void inOrderTraversal(Node mHeader){
	if(mHeader==null){
		return;
	}else if(mHeader.leftChild==null && mHeader.rightChild==null){
		System.out.println(mHeader.key);
		return;
	}
	inOrderTraversal(mHeader.leftChild);
	 System.out.println("Key"+mHeader.key);
	inOrderTraversal(mHeader.rightChild);
}

public static void main(String[] args){
MyBinarySearchTreeImplementation mBST= new MyBinarySearchTreeImplementation();
//Random rand = new Random();
//int n =0;
//for(int i = 0; i<10; i++){
//		n = rand.nextInt(5678)+1;
		mBST.add(1);
		mBST.add(2);
		mBST.add(3);
		mBST.add(4);
		mBST.add(5);
		mBST.add(6);
		mBST.add(7);

//}

mBST.inOrderTraversal(mainHeader);
}



}
