public class TreeSimpleUse{

	
}


public void contains_cycle(Node head){

}


public boolean BSTValidationCheck(Node root){

	Node leftChild = root.left;
	Node rightChild = root.right;

	if(root.left == null && root.right==null)
		return true;


	if(root.left<root && root.right>root ){
		BSTValidationCheck(leftChild);
		BSTValidationCheck(rightChild);
		return true;
		}
		else {
			return false;
		}
}


