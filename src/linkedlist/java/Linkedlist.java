package linkedlist.java;

public class Linkedlist {
	Node head;
	int size;
	Node last;
	
	public Linkedlist() {
		// TODO Auto-generated constructor stub
		head=null;
		size=0;
		last=null;
	}

	void create(int value)
	{
		
		Node new_node=new Node(value);
		if(head==null)   // list empty
		{
			head=new_node;  // add new node as fisrt node
			last=new_node;  // as it is single node so last will also point to new node
		}
		else
		{
			last.next=new_node;  //add new node in last node next section
			last=new_node;   //update last to point to last node
		}
		size++;
	}
	//traverse
	void traverse()
	{
		Node temp=head;  //make a reference to point to first node
		if(head ==null)
			System.out.println("list is empty");
		else
		{
			while(temp!=null) //traverse beyond last node
			{
				System.out.print(temp.data +" ->");
				temp=temp.next;
			}
			
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
		
		if(pos>size || size<2) {
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
			{
			if(head == last) {
			head = null;
			last = null;
			temp=null;
		}
		else {
			head = temp.next;
		
		}
			size--;
			}
		
	}
	
	//remove at last
	
	void removeAtLast() {
		Node temp = head;
		if(head == null) {
			System.out.println("List is empty cannot delete element ");
		}
		else {
			if(head == last) {
				head = null;
				last = null;
			}
			else {
				Node r=null;
				while(temp != last) {
					r = temp;
					temp = temp.next;
				}
				r.next = null;
				last=r;
				temp=null;
			}
			size--;
			
		}
	}
	
	//remove between
	void removeBetween(int pos) {
		if(pos>size || size<2) {
			System.out.println("Invalid position cannot delete element");
		}
		else {
			Node temp = head;
			Node r = null;
			
			for(int i=1;i<pos;i++) {
				r= temp;
				temp = temp.next;
			}
			r.next = temp.next;
			temp = null;
			size--;
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
	
	void search(int key)
	{
		if(head==null)
		{
			System.out.println("list is empty nothing to delete");
		}
		else
		{
			Node temp=head; 
			boolean flag=false;
			int count=1;
			while(temp!=null)
			{
				if(temp.data==key)
				{
					System.out.println("data found at "+count +"position");
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
		}}
	}
}
