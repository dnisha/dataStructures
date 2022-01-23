package linkedlist_practice.java;

import linkedlist.java.Node;

public class LinkedList {
	Node head;
	int size;
	Node last;
	
	public LinkedList() {
		head = null;
		last=null;
		size=0;
	}
	
	//create node
	void create(int val) {
		Node newnode = new Node(val);
		
		if(head == null) {
			head = newnode;
			last = newnode;
		}
		else {
			last.next = newnode;
			last = newnode;
		}
		size++;
	}
	//traverse
	void traverse() {
		Node temp = head;
		
		if(temp == null) {
			System.out.println("List is empty cannot traverse element ");
		}
		else {
			System.out.print("head->");
			while(temp != null) {
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.print("null");
		}
	}
	//add first
	
	void addFirst(int val) {
		Node newnode = new Node(val);
		
		if(head == null) {
			head=newnode;
			last = newnode;
		}
		else {
			newnode.next = head;
			head = newnode;
			
		}
		size++;
	
	}
	
	//add last
	void addLast(int val) {
		Node newnode = new Node(val);
		if(head == null) {
			head=newnode;
			last = newnode;
		}
		else {
			newnode.next = null;
			last.next = newnode;
			last = newnode;
		}
		size++;
	}

	//addbetween
	void addbetween(int val,int pos) {
		
		if(pos>size || size<2 || pos == 0) {
			System.out.println("Invalid position");
		}
		else {
			Node newnode = new Node(val);
			Node temp = head;
			for(int i=1;i<pos;i++) {
				temp = temp.next;
			}
			newnode.next = temp.next;
			temp.next = newnode;
			size++;
		}
	}
	//remove first
	
	void removeFirst() {
		Node temp = head;
		if(head == null) {
			System.out.println("List is empty cannot delete element ");
		}
		else 
			{if(head == last) {
			head = null;
			last = null;
		}
		else {
			head = temp.next;
			size--;
		}
		
	}
	}
	
	//remove using key
	void removeusingkey(int key)
	{
		if(head==null)
		{
			System.out.println("list is empty nothing to delete");
		}
		else
		{
			Node temp=head;  //temp will to that which we want to null
			boolean flag=false;
			Node prev=null;
			while(temp!=null)
			{
				if(temp.data==key)
				{
					if(head==temp)  //first node
					{
						if( head==last)
						{
							head=null;
							last=null;
						}
						else
						{
							head=temp.next;
						}
						
					}
					else
					{
						if(temp.next==null)//last node
						{
							prev.next=null;
							last=prev;
						}
						else
						{
						prev.next=temp.next;
						}
					}
					temp=null;
					flag=true;
					size--;
					break;
				}
				else
				{
					prev=temp;
					temp=temp.next;
				}
			}
			if(!flag)
			{
				System.out.println("node with key = "+key+ " not avaailble in list");
			}
					
	}}
	
	
	//search
	void search(int key) {
		if(head == null) {
			System.out.println("List is empty cannot find element ");
		}
		else {
			Node temp = head;
			int count =0;
			boolean flag=false;
			while(temp != null) {
				
				if(temp.data == key) {
					System.out.println("data found at "+count +" position");
					flag=true;
					break;
				}
				else
				{
					temp=temp.next;
				}
				count++;
			}
			if(!flag)
			{
				System.out.println("node with key = "+key+ " not avaailble in list");
			}
		}
	
	}
	//reverse

	
	void reverse() {
		Node prev,cur,temp;
		cur = head;
		prev = null;
		
		while(cur != null) {
			temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		head = prev;
	}
	
	//insert data in sorted manner
	void insertSorted(int key) {
	
	Node newnode = new Node(key);
	Node temp = head;
	
	if(head == null || head.data > key) {
		newnode.next = head;
		head=newnode;
	}
	else {
		while(temp.next != null && temp.next.data < key) {
			temp = temp.next;		}
		if(temp.next == null) {
			last = newnode;
}
			newnode.next = temp.next;
			temp.next = newnode;
		
	}

	size++;



	}
	
	//sort linked list
	void sort() {
		Node ptr,cpt;
		int temp;
		ptr = head;
		
		while(ptr.next != null) {
			cpt = ptr.next;
			while(cpt != null) {
			if(cpt.data < ptr.data) {
				temp = ptr.data;
				ptr.data = cpt.data;
				cpt.data = temp;
			}
			cpt=cpt.next;
			}
			ptr = ptr.next;
		}
	}
	
	//concat list
	void concat(LinkedList l1,LinkedList l2) {
		
		if(l1.size ==0 && l2.size ==0) {
		System.out.println("Both the list are empty");	
		}
		else {
			if(l1.size == 0 && l2.size !=0) {
				System.out.println("list 1 is empty");
				head = l2.head;
				//l2.traverse();
			}
			else if(l2.size == 0 && l1.size != 0) {
				head = l1.head;
				
			}
			else {
			Node tempLast =	l1.last;
			tempLast.next = l2.head;
			last = l2.last;
			this.size = l1.size+l2.size;
			l2 = null;
			}
		}
	}

}
