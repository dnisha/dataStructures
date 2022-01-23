package linkedlist_practice.java;

public class demo1 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
//		l1.removeFirst();
//		l1.traverse();
//		l1.create(10);
//		l1.create(20);
//		l1.addFirst(30);
//		l1.addFirst(5);
//		l1.addbetween(50,1);
//		l1.addLast(200);
//		l1.traverse();
//		System.out.println();
//		System.out.println("After Removing First Node");
//		l1.removeFirst();
//		l1.traverse();
//		System.out.println();
//		System.out.println("Asearch data using search");
//		l1.search(50);
//		l1.traverse();
//		System.out.println();
//		System.out.println("removing data using key");
//		l1.removeusingkey(15);
//		l1.traverse();
//		System.out.println();
//		System.out.println("after reverse");
//		l1.reverse();
//		l1.traverse();
//		System.out.println();
//		System.out.println("after sort");
//		l1.addLast(10);
//		l1.addLast(20);
//		l1.addLast(30);
//		l1.addLast(40);
//		l1.addLast(50);
		
		l2.addLast(60);
		l2.addLast(70);
		l2.addLast(80);
//		l1.insertSorted(5);
//		l1.insertSorted(1);
//		l1.insertSorted(100);
//		l1.sort();
		l1.concat(l1, l2);
		l1.traverse();
		//System.out.println(l1.last.data);
	}

}
