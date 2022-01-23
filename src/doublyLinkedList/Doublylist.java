package doublyLinkedList;

import java.util.Scanner;





public class Doublylist {
	Dnode head;
	int size;
	
	public Doublylist() {
		head=null;
		size=0;
	}
	//create
	void createlist(int n)
	{
		Scanner sc=new Scanner(System.in);
		int value=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("enter node value");
			value=sc.nextInt();
			Dnode new_node=new Dnode(value);
			if(head==null)
			{
				head=new_node;
			}
			else
			{
				Dnode temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=new_node;
				new_node.prev=temp;
			}
			size++;
		}
	}
	//traverse
	void traverse()
	 {
		
		 if(head==null)
		 {
			 System.out.println("list is empty");
		 }
		 
		 else
		 { 
			 Dnode r=head;
			 System.out.print("head <=> ");
		 while(r!=null)
		 {
			 if(r.next==null)
			 System.out.print(r.data);
			 else
				 System.out.print(r.data+" <=> ");
			 
			 
			 r=r.next;
		 }
		 System.out.println(" <=> null ");
		 System.out.println("size of doubly linked list "+size);
		 }}
	//add first
	void addFirst(int val) {
		Dnode new_node = new Dnode(val);
		
		if(head == null) {
			head = new_node;
		}
		else {
			new_node.next = head;
			head.prev = new_node;
			head=new_node;
		}
		size++;
	}
	//add last
	void addLast(int val) {
		Dnode new_node = new Dnode(val);
		Dnode temp=head;
		if(head == null) {
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
	//addBetween
	
	void addBetween(int value , int pos) {
		
		if(pos > size || size <2) {
			System.out.println("invalid position to insert");
		}
		else {
			Dnode new_node =new Dnode(value);
			Dnode temp = head;
			
			for(int i=1;i<pos;i++) {
				temp= temp.next;
			}
			new_node.next = temp.next;
			new_node.prev = temp;
			temp.next.prev = new_node;
			temp.next = new_node;
			
		}
		size++;
	}
	//deleteFirst
	void deleteFirst() {
		Dnode temp = head;
		
		if(temp == null) {
			System.out.println("list is already empty");
		}
		else {
		
			head = temp.next;
		}
		size--;
	}
	
	//deleteLast
	void deleteLast() {
		Dnode temp = head;

		if(temp == null) {
			System.out.println("list is already empty");
		}
		else {
			while(temp.next!= null) {
		
				temp = temp.next;
			}
			temp.prev.next = null;
		}
		size--;
	}
	
	//deleteBetween
	void deleteBetween(int pos) {
		Dnode temp = head;
		Dnode r = null;
		if(temp == null ) {
			System.out.println("list is already empty");
		}
		else if(size<pos ||pos <2) {
			System.out.println("invalid position");
		}
		else {
			for(int i =1;i<pos;i++) {
				r=temp;
				temp = temp.next;
			}
			r.next = temp.next;
			temp.next.prev = r;
		}
		size--;
	}
	
}
