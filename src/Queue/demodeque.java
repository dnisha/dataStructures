package Queue;

public class demodeque {

	public static void main(String[] args) {
		dequeue d = new dequeue(4);
	d.enqueuefront(10);
	d.enqueuefront(20);
	d.enqueuefront(30);
	d.enqueuefront(40);
	d.display();
	System.out.println();
	System.out.println("Removing element");
//	d.dequeuefront();
//	d.dequeuefront();
//	d.dequeuefront();
//	d.dequeuefront();
	d.dequeuerear();
	d.dequeuerear();
	d.dequeuerear();
	d.dequeuerear();



	}

}
