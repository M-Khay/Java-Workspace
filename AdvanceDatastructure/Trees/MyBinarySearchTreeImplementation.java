import java.util.Random;
import java.util.ArrayList;


 class MyBinarySearchTreeImplementation{

private static MyBinarySearchTreeImplementation mBST;
	class BinaryTreeNode{

	int value;
	BinaryTreeNode left, right;

	
	public BinaryTreeNode(int value){
		this.value = value;

	}

	public BinaryTreeNode insertLeft(int value){

		this.left = new BinaryTreeNode(value);
		return left;
	}

	public BinaryTreeNode insertRight(int value){

		this.right = new BinaryTreeNode(value);
		return right;

	}



}

public void inOrderTraversal(BinaryTreeNode mHeader){
	if(mHeader==null){
		
		return;
	
	}

	System.out.println("Key"+mHeader.value);
	inOrderTraversal(mHeader.left);
	inOrderTraversal(mHeader.right);
}

static BinaryTreeNode header;
BinaryTreeNode lastAddedNode;

public BinaryTreeNode makeBST(ArrayList<Integer> input){

	for(Integer value : input ){

		if(header ==null){
			header = new BinaryTreeNode(value);

		}else{
			BinaryTreeNode currentHead = header; 
			do{

			if(value >= currentHead.value){
				if(currentHead.right == null){
				lastAddedNode = currentHead.insertRight(value);
				System.out.println("lastAddedNode right "+ lastAddedNode.value);
				break;
				}
				currentHead = currentHead.right;

			}else{
				if(currentHead.left == null){
				lastAddedNode = currentHead.insertLeft(value);
				System.out.println("lastAddedNode left "+ lastAddedNode.value);
				break;

				}
				currentHead = currentHead.left;
				
			}	
			}while(true);
			
		}

	}
	return header;
}

public static void main(String[] args){
mBST= new MyBinarySearchTreeImplementation();
Random rand = new Random();
int n =0;

ArrayList<Integer> input = new ArrayList<Integer>();
for(int i = 0; i<10; i++){
		n = rand.nextInt(100)+1;
		System.out.println("Key being added"+ n);

		input.add(n);
}

mBST.makeBST(input);
mBST.inOrderTraversal(header);

BinaryTreeNode largestNode = mBST.getLargestNode(header,false);
BinaryTreeNode secondLargestNode = mBST.getSecondLargestElement(header);
System.out.println("Largest Node : " + largestNode.value + " Second Largest Node :"+ secondLargestNode.value);
}



private BinaryTreeNode getLargestNode(BinaryTreeNode header, boolean returnSecondLargestNode){

	BinaryTreeNode largestNodeparent=new BinaryTreeNode(0);
	
	BinaryTreeNode currentNode = header;
	while(currentNode.right !=null ){
		largestNodeparent = currentNode;
		currentNode= currentNode.right;
	}
System.out.println("Currentnode " + currentNode.value);

if(returnSecondLargestNode){
	
	return largestNodeparent;
}
return currentNode;	
}


private BinaryTreeNode getSecondLargestElement(BinaryTreeNode header){

BinaryTreeNode secondLargestNode;
	if(header==null){
		return header;
	}

	BinaryTreeNode largestElement = mBST.getLargestNode(header,false);

	if(largestElement.left!=null){
		 secondLargestNode = getLargestNode(largestElement.left,false);
	return secondLargestNode;
	}else{
			secondLargestNode = getLargestNode(header,true);
	}
	return secondLargestNode;

}

}



