package circular_linklist;



import linkedlist.java.Node;

public class circuler_linklist {
Node head,last;
int size;
public circuler_linklist() {
	head = null;
	size = 0;
	last = null;
}
//create node

void createNode(int data) {
	Node new_node = new Node(data);
	if(head == null) {
		head = new_node;
		last = new_node;
	}
	else {
		last.next = new_node;
		last = new_node;
		
	}
	new_node.next = head;
	size++;
}

//traverse
void traverse() {
	if(head == null) {
		System.out.println("list is empty");
	}
	else {
		Node temp= head;
		System.out.print("head -> ");
		

			do {
			if(temp.next==head)
			{	
			System.out.print(temp.data +" ->");
			
			}
			else {
				System.out.print(temp.data+" -> ");
			}
			temp = temp.next;
		}while(temp != head);
		System.out.println(" head ");
		System.out.println("size of list : "+size);
	}
}

//add First
void addFirst(int data) {
	Node new_node = new Node(data);
	last.next = new_node;
	new_node.next = head;
	head = new_node;
	size++;
}
//add last

void addLast(int data) {
	Node new_node = new Node(data);
	last.next = new_node;
	last = new_node;
	new_node.next = head;

	size++;
}

//addBetween

void addAtPosition(int data,int pos) {
	if(pos > size || pos <2) {
		System.out.println("invalid position");
	}
	else {
		Node temp=head;
          Node new_node = new Node(data);
          for(int i=1;i<pos;i++) {
        	  
        	  temp = temp.next;
          }
          if(temp != last) {
        	  new_node.next = temp.next;
        	  temp.next = new_node;
          }
          else {
        		last.next = new_node;
        		last = new_node;
        		new_node.next = head;

          }
      size++;
	}
}

//remove First

void removeFirst() {
	if(head == last) {
		System.out.println("list is empty");
	}
	else {
		head = head.next;
		last.next = head;
		size--;
	}
	
}
//remove last
void removeLast() {
	if(head == last) {
		System.out.println("list is empty");
	}
	else {
		Node temp = head;
		while(temp.next != last) {
			temp = temp.next;
		}
		temp.next = head;
		last = temp;
		size--;
	}
}

//remove at position
void removeAtPosition(int pos) {
	if(pos > size) {
		System.out.println("invalid position");
	}
	else {
		Node temp = head;
		Node r = null;
		  for(int i=1;i<pos;i++) {
			  r=temp;
			  temp = temp.next;
		  }
		  if(temp != last) {
			  r.next = temp.next;
		  }
		  else {
			  r.next= head;
		  }
		
		  size--;
	}
}

//searchData
void search(int data) {
	boolean flag =false;
	int p=1;
	if(head == last) {
		System.out.println("list is empty");
	}
	else {
		Node temp = head;
		while(temp != last) {
			if(temp.data == data) {
				p++;
				flag = true;
				break;
			}
			temp = temp.next;
		}
		if(flag == true) {
			System.out.println("Element found at position : "+(p+1));
		}
		else {
			System.out.println("element not present in the list..!!");
		}
	}
}

}
