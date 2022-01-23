package doublyLinkedList_practice;

public class demo {

	public static void main(String[] args) {
		doublyLinkedlist d = new doublyLinkedlist();
		d.createList(3);
		System.out.println(d.listsize());
	
		d.traverse();
	}

}
