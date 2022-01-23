package doublyLinkedList_practice;

import java.util.Scanner;



public class doublyLinkedlist {
	dnode head;
	int size;
	
	public doublyLinkedlist() {
		head = null;
		size = 0;
	}
	
	//creation of list
	void createList(int n) {
		
		Scanner sc = new Scanner(System.in);
		int value=0;
		dnode temp = head;
	
		
		for(int i =0;i<n;i++) {
			System.out.println("Enter value of node : ");
			value = sc.nextInt();
			dnode new_node = new dnode(value);
			if(temp == null) {
				head = new_node;
				
			}
			else {
				while(temp.next != null) {
					temp = temp.next;
				}
				temp.next = new_node;
				new_node.prev = temp;
				
			}
			size++;
		}
	}
	//size
	
	public int listsize(){
		return size;
	}
	//list traversal
	void traverse() {
		dnode temp = head;
		if(temp ==  null) {
			System.out.println("Empty list, cannot traverse element ");
		}
		else {
			System.out.print("head -> ");
			while( temp != null) {
				System.out.print(temp.data+"-> ");
				temp = temp.next;
			}
			System.out.print("null");
		}
		
	}

}
