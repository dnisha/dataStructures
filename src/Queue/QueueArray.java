package Queue;

public class QueueArray {
int front,rare;
int max;
int arr [];

public QueueArray() {
	max = 8;
	front = -1;
	rare = -1;
}

public QueueArray(int d) {
	max = d;
	front = -1;
	rare = -1;
	arr = new int[max];
}

//insertion
void insertion(int val) {
	if(rare  == max-1) {
		System.out.println("Queue is full cannot fill elements ....!");
	}
	else {
		arr[++rare] = val;
		if(front == -1) {
			front =0;
		}
		
	}
}

//display queue
void traverse() {
	if(front == -1 && rare == -1) {
		System.out.println("queue is empty");
	}
	System.out.print("Queue elements are : ");
	for(int i=front;i<=rare;i++) {
		System.out.print(arr[i]+",");
	}
}
//deletion
int deletion() {
	if(front == -1) {
		System.out.println("queue is empty..!");
		return 0;
	}else {
		int data = arr[front];
		arr[front] = 0;
		if(front == rare) {
			front = rare =-1;
		}
		else {
			front++;
		}
		return data;
	}
}

//isFull
boolean isFull() {
	if(rare == max-1) {
		return true;
	}
	else {
		return false;
	}
}

//isEmpty
boolean isEmpty() {
	if(front == -1 && rare == -1) {
		return true;
	}
	else {
		return false;
	}
}
}
