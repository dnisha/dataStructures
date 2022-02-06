package Queue;

public class CirculerQueue {
	int max;
	int front,rear;
	int arr [];
	public CirculerQueue(int m) {
		front=-1;
		rear =-1;
	
		max = m;
		arr = new int[max];
	}
	

	//enqueue
	void enqueue(int val) {
		
		if((rear+1)%max == front) {
			System.out.println("Queue is already full...!!");
		}
		if(front == -1) front = 0;
		rear = (rear+1)%max;
		arr[rear] = val;
	}
	
	//dequeue
	int deletequeue() {
		int result ;
		if(front  == -1) {
			System.out.println("Queue is empty..!!");
			return -1;
		}
		result= arr[front];
		if(front == rear) {
			front = rear = -1;
		}
		else {
		
			front = (front+1)%max;
		}
		return result;
		
	}
	//display
	void display() {
	
		if(front == -1 && rear == -1) {
			System.out.println("Queue is empty");
		}
		else if(front < rear) {
			for(int i =front ; i<=rear;i++) {
				System.out.println(arr[i]);
			}
		}
		else {
			for(int i =front ; i != rear;i=(i+1)%max) {
				System.out.println(arr[i]);
			}
		}
	
	}
	
	//isFull
	boolean isFull() {
		if(rear == max-1 || (rear+1)%max == front) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//isEmpty
	boolean isEmpty() {
		if(front == -1 && rear == -1) {
			return true;
		}
		else {
			return false;
		}
	}
}
