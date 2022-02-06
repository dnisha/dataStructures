package priorityQueue;

public class demo {

	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue(4);
		p.enqueue(10, 0);
		p.enqueue(20, 1);
		p.enqueue(30, 2);
		p.enqueue(40, 3);
	
		p.display();
		
	}

}
