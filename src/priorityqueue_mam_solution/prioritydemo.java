package priorityqueue_mam_solution;

import java.util.Scanner;

public class prioritydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Priorityqueue pq=new Priorityqueue();
Scanner sc=new Scanner(System.in);
int data;
int priority;
for(int i=0; i<4;i++)
{
	System.out.println("enter value of data");
	data=sc.nextInt();
	System.out.println("enter value of priority");
	priority=sc.nextInt();
	pq.insertion(new Element(data,priority,i+1));
}
pq.display();
pq.deletion();
pq.deletion();
	}
	

}
