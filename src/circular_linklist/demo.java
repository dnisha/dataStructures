package circular_linklist;

public class demo {

	public static void main(String[] args) {
		circuler_linklist c = new circuler_linklist();
		
		c.createNode(10);
		c.createNode(20);
		c.createNode(30);
		c.createNode(40);
		c.addFirst(5);
		c.addLast(50);
		c.traverse();
		System.out.println("Insert node at position : ");
		c.addAtPosition(19, 2);
		c.traverse();
	
		System.out.println("After removing first element : ");
		c.removeFirst();
		c.traverse();
		System.out.println("After removing last element : ");
		c.removeLast();
		c.traverse();
		System.out.println("Removing at position : ");
		c.removeAtPosition(5);
		c.traverse();
		System.out.println("Search element : ");
		c.search(20);
		c.traverse();
	}

}
