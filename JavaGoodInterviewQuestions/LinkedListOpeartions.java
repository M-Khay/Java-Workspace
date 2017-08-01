// Reverse a linked list 
// Reverse a double linked list


 // Iteratively. 

    void reverse() {
        Node temp = null;
        Node current = head;
 
        /* swap next and prev for all nodes of 
         doubly linked list */
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
 
        /* Before changing head, check for the cases like empty 
         list and list with only one node */
        if (temp != null) {
            head = temp.prev;
        }
    }


  // Recursively 


// call using Head.

  private Node reverse(Node current){

  Node temp;

  if(current==null){
  
  	return;

   }else {

   temp = current.prev;
   current.prev =  current.next;
   current.next = temp;
   current = current.prev;
   reverse(current);

   }


  }
