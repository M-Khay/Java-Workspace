public class ValidateBinarySearchTree{



class BinaryTree{

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

public BinaryTreeNode makeBST(){

Random rand = new Random();
int n =0;

ArrayList<Integer> input = new ArrayList<Integer>();
for(int i = 0; i<10; i++){
		n = rand.nextInt(100)+1;
		System.out.println("Key being added"+ n);

		input.add(n);
}

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

private boolean validateBST(BinaryTreeNode header){


}
}



