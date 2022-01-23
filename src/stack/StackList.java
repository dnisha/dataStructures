package stack;



public class StackList {
int size;
Node top;
public StackList() {
	// TODO Auto-generated constructor stub
	size = 0;
	top = null;
}

//push
void push(int val) {
	
	Node new_node = null;
	new_node = new Node(val);
	
	if(new_node == null) {
		System.out.println("Stack overflow");
	}
	else {
		if(top == null) {
			top = new_node;
			
		}
		else {
			new_node.next = top;
			top = new_node;
		}
		size++;
	}
	
}

//pop
int pop() {
	Node temp = top;
	int data=0;
	if(top== null) {
		System.out.println("List underflow");
	}
	else {
		data = temp.data;
		top = temp.next;
		size--;
	}
	return data;
}

//traverse
void traverse() {
	Node temp = top;
	if(temp == null) {
		System.out.println("List is empty");
	}
	else {
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
}

}
