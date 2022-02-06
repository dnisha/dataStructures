package Queue;

public class demoCir {

	public static void main(String[] args) {
		CirculerQueue c = new CirculerQueue(3);
		System.out.println("Is full : "+c.isFull());
		System.out.println("Is Empty : "+c.isEmpty());
		c.display();
	c.enqueue(10);
	c.enqueue(20);
	c.enqueue(30);

	c.deletequeue();
	c.enqueue(40);
	System.out.println("Is full : "+c.isFull());
	System.out.println("Is Empty : "+c.isEmpty());
	c.display();

	System.out.println("removing element from queue");
System.out.println(c.deletequeue());
System.out.println(c.deletequeue());
System.out.println(c.deletequeue());
System.out.println(c.deletequeue());

	}

}
