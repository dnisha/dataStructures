package Queue;

public class Demo1List {

	public static void main(String[] args) {
		QueueList q = new QueueList(3);
		System.out.println("is empty : "+q.isEmpty());
		System.out.println("is full : "+q.isFull());
		q.delete();
		q.traverse();
		q.addElementFront(10);
		q.addElementFront(20);
		System.out.println("is empty : "+q.isEmpty());
		System.out.println("is full : "+q.isFull());
		q.addElementRear(30);
		q.addElementRear(40);
		q.traverse();
		q.delete();
		q.addAtPosition(35, 1);
		q.traverse();

	}

}
