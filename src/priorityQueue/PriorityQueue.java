package priorityQueue;

import java.util.Iterator;

public class PriorityQueue {
int max,front,rear;
Element a[];
public PriorityQueue() {
	front = -1;
	rear=-1;
	max=5;
	a = new Element [max];
}

public PriorityQueue(int m) {
	front = -1;
	rear=-1;
	max = m;
	a = new Element [max];
}

//insert element
void enqueue(int val,int p) {
	Element new_Elent = new Element(val, p);
	if(front == 0 && rear == max-1) {
		System.out.println("Queue is full...!!");
	}
	else if(front == -1 && rear == -1){
		front = rear =0;
		a[rear]=new_Elent;
		
	}
	else {
		for(int i =front;i<=rear ; i++) {
			if(a[i].priority <p) {
				a[i+1] = new_Elent;
				
			}
			else {
				Element temp = a[i];
				a[i] = new_Elent;
			
				a[i+1] = temp;
				}
			rear++;
		}
		
	}
}

//display
void display() {
	for(int i= front;i<=rear ; i++) {
		System.out.println(a[i].data+",");
	}
}
}
