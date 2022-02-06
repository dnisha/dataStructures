package doublyCircularList;

import java.util.Iterator;



public class DoublyCircularList {

	Node head,last;
	int size;
	
	public DoublyCircularList() {
	
		size =0;
		head= null;
		last = null;
	}
	
	//creating node
	
	void createNode(int data) {
		Node new_node = new Node(data);
		if(head == null) {
			head = new_node ;
			last = new_node;
		}
		else {
			last.next = new_node;
			new_node.prev=last;
			last = new_node;
		}
		last.next = head;
		size++;
	}
	
	//traverse
	void traverse() {
		Node temp = head;
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			System.out.print("head <=> ");
			do {
				System.out.print(temp.data+" <=> ");
				temp = temp.next;
			}while(temp != head);
			System.out.println(" head ");
		}
		System.out.println("size : "+size);
	}
	//addFirst
	
	void addFirst(int val) {
		Node temp = head;
		Node new_Node = new Node(val);
		if(head == null) {
		 head = new_Node;
		 last = new_Node;
		}
		else {
			new_Node.next = temp;
			temp.next.prev = new_Node;
			head = new_Node;
			last.next = new_Node;
		}
		size++;
	}
	
	//addLast
	void addLast(int val) {
		Node temp = head;
		Node new_Node = new Node(val);
		if(head == null) {
		 head = new_Node;
		 last = new_Node;
		}
		else {
			last.next = new_Node;
			new_Node.next = head;
			last = new_Node;
		}
		size++;
		
	}
	//insertBetween
	
	void inserAtPosition(int pos , int val) {
		Node temp = head;
		Node new_Node = new Node(val);
		
		if(pos > size || pos < 2) {
			System.out.println("Ïnvalid position");
		}
		else {
			for(int i=2;i<pos;i++) {
			
				temp =temp.next;
		}
			new_Node.prev = temp;
			temp.next.prev = new_Node;
			
			new_Node.next = temp.next;
			temp.next=new_Node;
				
				
			}
			size++;
		}
	
	//deleteFirst
	
	void deleteFirst() {

		if(head == null) {
			System.out.println("List is Empty");
		}
		else {
			head = head.next;
			last.next = head;
			size--;
		}
	}
	
	//deletionLast
	
	void deleteLast() {
		if(head == null) {
			System.out.println("List is Empty");
		}
		else {
			last = last.prev;
			last.next = head;
			size--;
		}
	}
	
	//delete at position
	void deleteAtPosition(int pos) {
		Node temp = head;
		if(pos > size ) {
			System.out.println("Invalid position");
		}
		else {
			for(int i=1;i<pos;i++) {
				temp = temp.next;
			}
			if(temp == head) {
				head= temp.next;
				temp.next.prev = last;
				last.next = head;
			}
			else if (temp == last) {
				last = last.prev;
				last.next = head;
			}
			else {
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
			}
		}
	size--;
	}
	
}
