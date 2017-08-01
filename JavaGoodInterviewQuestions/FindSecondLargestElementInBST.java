public class FindSecondLargestElementInBST{

	

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