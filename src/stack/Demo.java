package stack;

public class Demo {

	public static void main(String[] args) {
		StackArray s = new StackArray(4);
		s.traverse();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
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
