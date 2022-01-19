package arraycreation;

public class example {
public static void main(String[] args) {
array arl=new array(10);
System.out.print("array content are : ");
arl.display();
System.out.println("array size :"+arl.count());
//System.out.println("array capacity :"+arl.c);
arl.add(1);
arl.add(2);
arl.add(3);
arl.add(4);
arl.add(5);
arl.add(6);
System.out.print("array content are : ");
arl.display();
System.out.println("array size :"+arl.count());
arl.remove();
arl.remove();
System.out.print("array content are : ");
arl.display();
System.out.println("array size :"+arl.count());
arl.insertbetween(1, 8);
System.out.print("array content are : ");
arl.display();
System.out.println("array size :"+arl.count());
arl.deletebetween(1);
System.out.print("array content are : ");
arl.display();
System.out.println("array size :"+arl.count());
arl.deletebetween(2);
System.out.print("array content are : ");
arl.display();
System.out.println("array size :"+arl.count());
}
}