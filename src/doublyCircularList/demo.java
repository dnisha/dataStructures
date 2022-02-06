package doublyCircularList;

public class demo {

	public static void main(String[] args) {
		DoublyCircularList d = new DoublyCircularList();
		d.createNode(10);
		d.createNode(20);
		d.createNode(30);
		d.traverse();
		System.out.println();
		System.out.println("after insertion at first : ");
		d.addFirst(5);
		d.traverse();
		System.out.println();
		System.out.println("after insertion at last : ");
		d.addLast(40);
		d.traverse();
		System.out.println();
		System.out.println("after insertion at position : ");
		d.inserAtPosition(5, 15);
		d.traverse();
		System.out.println();
		System.out.println("deleteion at first : ");
		d.deleteFirst();
		d.traverse();
		System.out.println();
		System.out.println("deleteion at last : ");
		d.deleteLast();
		d.traverse();
		System.out.println();
		System.out.println("deleteion at position : ");
		d.deleteAtPosition(3);
		d.traverse();
	}

}
