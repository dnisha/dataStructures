package Queue;

import linkedlist.java.Node;

public class QueueList {
int size,max;
Node front,rear;
	public QueueList(int m) {
		front=null;
		rear =null;
		size =0;
		max = m;
	}
	

	//add element Rear
	void addElementRear(int val) {
		Node new_node = new Node(val);
		if(size == max) {
			System.out.println("List is full");
			
		}
		else {
			if(front==null && rear == null) {
				front = new_node;
				rear = new_node;
			}
			else {
				rear.next = new_node;
				rear = new_node;
			}
		
			size++;
		
		}
	
		
	}
	//add element front
	void addElementFront (int val) {
		Node new_node = new Node(val);
		if(size == max) {
			System.out.println("List is full");
			
		}
	
		else {
			if(front==null && rear == null) {
				front = new_node;
				rear = new_node;
			}
			else {
				
				
				new_node.next= front;
				front = new_node;
			}
			size++;
		}

	}
	
	//add at Position
	void  addAtPosition(int val,int pos) {
	
		
		if(pos>size || size<2 || pos == 0) {
			System.out.println("Invalid position");
		}
		else {
			Node newnode = new Node(val);
			Node temp = front;
			for(int i=1;i<pos;i++) {
				temp = temp.next;
			}
			newnode.next = temp.next;
			temp.next = newnode;
			size++;
		}
	

			
		
			
		}
	
	//traverse
	void traverse() {
		if(front==null && rear == null) {
			System.out.println("List is empty...!");
		}
		else {
			
			Node temp = front;
			
			System.out.print("front -> ");
			while(temp != null) {
				System.out.print(temp.data+",");
				temp = temp.next;
			}
			System.out.println(" <- rear");
		}
	}
	//delete
	void delete() {
		if(front==null && rear == null) {
			System.out.println("List is empty cannot delete element...!");
		}
		else {
			
			front = front.next;
			size--;
			
			
		}
		
	}
	
	
	//isEmpty
	
	boolean isEmpty() {
		if(front == null && rear == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//isFull
	boolean isFull() {
		if(size == max) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
