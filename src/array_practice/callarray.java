package array_practice;

public class callarray {

	public static void main(String[] args) {
		array arr = new array(8);
		System.out.println("size of array : "+arr.size());
		System.out.print("array content are : ");
	    arr.add(2);
		arr.add(10);
		arr.add(15);
		arr.add(12);
		arr.add(26);
		
		arr.display();
		System.out.println();
		System.out.println("size of array : "+arr.size());
		
		arr.insertbetween(1, 100);
		arr.display();
		System.out.println();
		System.out.println("size of array : "+arr.size());
		
		
	//	array.deletebetween(2);
		//array.display();
		//System.out.println();
		//System.out.println("size of array : "+array.size());
//		array.clear();
		
		//array.addall(2);
		//array.search(0);
		
		//arr.display();
		//System.out.println();
    // System.out.println("size of array : "+arr.size());
		
		//arr.reverse(a);
		//arr.sort();
		//arr.display();
		//System.out.println(arr.sum());
		//System.out.println(arr.average());
		array a1 = new array(3);
		array a2 = new array(4);
		a1.addall(2);
		a2.addall(3);
		
		a1.concat(a1, a2);
		
		
}

}
