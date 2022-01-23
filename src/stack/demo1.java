package stack;

public class demo1 {

	public static void main(String[] args) {
		StackList s = new StackList();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.traverse();
		System.out.println("list after pop : ");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

	}

}
