package Queue;

public class dequeue {
int front,rear,max;
int a[];

public dequeue() {
	front = rear = -1;
	max= 5;
	a = new int [max];
}

public dequeue(int m) {
	front = rear = -1;
	max= m;
	a = new int [max];
}

//enqueue front
void enqueuefront(int val) {
if((front ==0 && rear == max-1) || front == rear+1) {
	System.out.println("Queue is full");
}
else if(front == -1 && rear == -1) {
	front = rear =0;
	a[front] = val;
}
else if(front ==0) {
	front = max-1;
	a[front] = val;
}
else {
	front--;
	a[front] = val;
}
}
//enqueue rear
void enqueuerear(int val) {
	if((front ==0 && rear == max-1) || front == rear+1) {
		System.out.println("Queue is full");
	}
	else if(front == -1 && rear == -1) {
		front = rear =0;
		a[rear] = val;
	}
	else if(rear == max-1) {
		rear = 0;
		a[rear] = val;
	}
	else {
		rear++;
		a[rear]= val;
	}
}


//display
void display() {
	int i = front;
	
	while(i != rear) {
		System.out.print(a[i]+",");
		i = (i+1)%max;
	}
	System.out.print(a[rear]);
}

//dequeue front
void dequeuefront() {
	if(front == -1 && rear == -1) {
		System.out.println("Queue is empty..!!");
	}
	else if(front == rear) {
	 System.out.println(a[front]);
	 front = rear =-1;
	}
	else if(front == max-1) {
		System.out.println(a[front]);
		front = 0;
	}
	else {
		System.out.println(a[front]);
		front++;
	}
}

//dequeue rear
void dequeuerear() {
	if(front == -1 && rear == -1) {
		System.out.println("Queue is empty..!!");
	}
	else if (front == rear) {
		System.out.println(a[rear]);
		front = rear = -1;
	}
	else if (rear == 0) {
		System.out.println(a[rear]);
		rear = max-1;
		
	}
	else {
		System.out.println(a[rear]);
		rear--;
	}
	
}
}
