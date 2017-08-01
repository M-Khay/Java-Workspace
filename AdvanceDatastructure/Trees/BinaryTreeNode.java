public class BinaryTreeNode{

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