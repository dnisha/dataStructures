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
//	void reverse() {
//		Node prev,cur,temp;
//		
//		temp = head;
//		cur = null;
//		
//		while(temp != null) {
//			prev = cur;
//			cur = temp;
//			temp = temp.next;
//			cur.next = prev;
//			
//		}
//		head = cur;
//	}
	
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
	
	while(temp != null) {
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
	newnode.next = null;
	last.next = newnode;
	last = newnode;
	size++;

	}
	
}
