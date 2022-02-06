package stack;

public class Demo {

	public static void main(String[] args) {
		StackArray s = new StackArray(4);
		
		System.out.println("Queue is full : "+s.isFull());
		System.out.println("Queue is empty : "+s.isEmpty());
		s.traverse();
		s.push(10);
		System.out.println("Queue is empty : "+s.isEmpty());
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println("Queue is full : "+s.isFull());
		s.push(50);
		s.traverse();
		System.out.println();
		System.out.println("poping element : ");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println("traverse after pop");
		s.traverse();
	}

}
