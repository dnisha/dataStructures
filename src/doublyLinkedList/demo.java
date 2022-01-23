package doublyLinkedList;

public class demo {

	public static void main(String[] args) {
	Doublylist d = new Doublylist();
	
	d.addFirst(10);
	d.addFirst(20);
	d.addLast(30);
	d.addLast(40);
	d.addBetween(19, 2);
	//d.createlist(2);
		d.traverse();
		d.deleteFirst();
		d.traverse();
		d.deleteLast();
		d.traverse();
		d.deleteBetween( 2);
		d.traverse();
	}

}
