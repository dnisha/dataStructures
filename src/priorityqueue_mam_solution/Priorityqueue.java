package priorityqueue_mam_solution;

public class Priorityqueue {
	int front, rear;
	 int max;
	 Element arr[];
	 
	 public Priorityqueue() {
		max=8;
		front=-1;
		rear=-1;
		arr=new Element[max];
	}
	 public Priorityqueue(int d) {
			max=d;
			front=-1;
			rear=-1;
			arr=new Element[max];
		}
	 
	 void insertion(Element value)
	 {
		 if(rear==max-1)
		 {
			 System.out.println("queue full can't insert "+value);
		 }
		 else
		 {
			 rear++;
			 arr[rear]=value;
			 if(front==-1) //first insertion
				 front=0;
			
			 for(int i=front;i<rear;i++)
			 {
				 for(int j=i+1;j<rear;j++)
				 {
					 if(arr[i].priority<arr[j].priority)
					 {
						 System.out.println("hello");
						 swap(arr[i],arr[j]);
					 }
					 else
					 {
						 if(arr[i].priority==arr[j].priority)
							{
								 if(arr[i].order>arr[j].order)
									{System.out.println("hi");
										swap(arr[i],arr[j]);
									}
							}
					 }
				 }
			 }
		 }}
	 
	 private void swap(Element e1, Element e2) {
		// TODO Auto-generated method stub
		Element temp;
		temp=e1;
		e1=e2;
		e2=temp;
	}
	void deletion()
	 {
		 if(front==-1)
			 {
			 System.out.println("queue empty");
			 
			 }
		 else
		 {
			 Element data=arr[front];
			 arr[front]=new Element(0,0,0);
			 if(front==rear) //single element condition
				 front=rear=-1;
			 else
				 front=front+1;
			 System.out.println("element deleted from queue: "+data);
			
		 }
		 
	 }
	 
	 void display()
	 {
		 if(front==-1)
			 System.out.println("queue empty");
		 else
		 {
			 for(int i=front;i<=rear;i++)
				 System.out.println(arr[i]);
		 }
	 }
}
