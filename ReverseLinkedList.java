public class ReverseLinkedList {

public Node reverseLinkedList (Node head){
	if(head==null||head.next==null){
		return head;
	}

	Node secondNode = head.next;

	Node result = reverseLinkedList(secondNode);

	result.next = head;

	return result;
}

}