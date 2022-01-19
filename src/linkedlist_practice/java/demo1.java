package linkedlist_practice.java;

public class demo1 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.removeFirst();
		l1.traverse();
		l1.create(12);
		l1.create(15);
		l1.addFirst(2);
		l1.addFirst(5);
		l1.addbetween(50,1);
		l1.addLast(200);
		l1.traverse();
		System.out.println();
		System.out.println("After Removing First Node");
		l1.removeFirst();
		l1.traverse();
		System.out.println();
		System.out.println("Asearch data using search");
		l1.search(50);
		l1.traverse();
		System.out.println();
		System.out.println("removing data using key");
		l1.removeusingkey(15);
		l1.traverse();
		System.out.println();
		System.out.println("after reverse");
		l1.reverse();
		l1.traverse();
	}

}
