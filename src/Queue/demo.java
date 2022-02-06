package Queue;

public class demo {

	public static void main(String[] args) {
		QueueArray q = new QueueArray(5);
		System.out.println("is Empty : "+q.isEmpty());
		System.out.println("is Full : "+q.isFull());
q.insertion(1);
q.insertion(2);
q.insertion(3);
q.insertion(4);
q.insertion(5);

q.traverse();
System.out.println();
System.out.println("is Empty : "+q.isEmpty());
System.out.println("is Full : "+q.isFull());
System.out.println();
System.out.println(q.deletion());
System.out.println(q.deletion());
q.traverse();
System.out.println(q.deletion());
System.out.println(q.deletion());
q.insertion(6);
q.insertion(6);
q.traverse();
	}

}
