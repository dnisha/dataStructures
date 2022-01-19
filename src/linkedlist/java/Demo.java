package linkedlist.java;

public class Demo {
public static void main(String[] args) {
	Linkedlist l=new Linkedlist();

	l.traverse();
	System.out.println("entered first node");
	l.create(10);
	l.create(20);
	l.addFirst(1);
	l.addbetween(50,10);
	l.addLast(100);
	l.addLast(101);
	l.addLast(102);
	l.addLast(103);
	l.traverse();
	System.out.println();
	System.out.println("After Removing First Node");
	l.removeFirst();
	l.traverse();
	System.out.println();
	System.out.println("After Removing Last Node");
	l.removeAtLast();
	l.traverse();
	System.out.println();
	System.out.println("After Remove using key");
	l.removeusingkey(101);
	l.traverse();
	System.out.println();
	System.out.println("search using key");
	l.search(100);
}
}
