package stack;

public class StackArray {

	int top;
	int max;
	int [] arr;
	
	public StackArray() {
		max = 8;
		top=-1;
		arr = new int [max];
	}
	
	public StackArray(int max) {
		this.max = max;
		top = -1;
		arr = new int [this.max];
	}
	
	//push
	void push(int val) {
		if(top==max-1) {
			System.out.println("Stack Overflow");
		
		}
		else {
			arr[++top] = val;
		}
		
	}
	
	//traverse
	void traverse() {
		
		if (top == -1) {
			System.out.println("stack is empty");
			
		}
		else {
			for(int i = 0;i<=top;i++) {
				System.out.print(arr[i]+",");
		
		}
		}
		
		
		
	}
	
	//pop
	int pop() {
		int data = arr[top];
		arr[top--] = 0;
		return data;
	}
	
	//isfull
	boolean isFull() {
		if(top == max-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//isEmpty
	boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
}
