package priorityqueue_mam_solution;

public class Element {
	int data;
	int priority;
	int order;
	public Element(int data, int priority, int order) {
		super();
		this.data = data;
		this.priority = priority;
		this.order = order;
	}
	@Override
	public String toString() {
		return "Element [data=" + data + ", priority=" + priority + ", order=" + order + "]";
	}
	

}
