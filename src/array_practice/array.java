package array_practice;
import java.util.Scanner;



public class array {
	int capacity;
	int [] arr;
	int size;
	
	//array of default size 5
	public array() {
		capacity = 5;
		arr = new int[capacity];
		size=0;
	}
	//array of defined capacity
	public  array(int c) {
		capacity = c;
		arr = new int[capacity];
		size=0;
	}
	
	//add element to array
	void add(int data) {
		
		if(size<capacity) {
			arr[size]= data;
			size++;
		}
		else {
			System.out.println("cannot insert data out of capacity");
		}
	}
	
	//display array element
	void display() {
		System.out.print("[");
		for(int i =0;i<capacity;i++) {
			
			System.out.print(arr[i]+",");
		}
		System.out.print("]");
	}
	
	//remove element 
	void remove() {
		arr[size-1] = 0;
		size--;
	}

	//current size of array
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	//insert inbetween 
	void insertbetween(int pos,int data) {
		if(size < capacity) {
			for(int i=size;i>pos;i--) {
				arr[i]=arr[i-1];
			
				
			}
			arr[pos]=data;
			size++;
		}
		else {
			{
				System.out.println("array is small to insert data");
			}
		}
	
	}
	//delete in between
	void deletebetween(int pos) {
		if(pos == 0) {
			arr[0] = 0;
			
		}
		else {
			for(int i=pos;i<size;i++) {
				arr[i]=arr[i+1];
			}
			size--;
		}
		
	}
	//delete all element of array
	void clear() {
		if(size == 0) {
			System.out.println("array is empty");
		}
		else {
			for(int i = size-1;i>=0;i--) {
				arr[i]= 0;
			}
		}
	}
	
	//add defined number of elements
	void addall(int n) {
		int a= size;
		
		if(size+n > capacity) {
			System.out.println("cannot insert all element");
		}
		else {
			System.out.println("enter array element");
			Scanner sc=new Scanner(System.in);  
			for(int i=size;i<n+a;i++) {
				arr[i] = sc.nextInt();
				size++;
			}
		}
	}
	
	//search
	void search(int data) {
		boolean flag = false;
		int index=0;
		for(int i=0;i<size;i++) {
			if(arr[i] == data) {
				flag = true;
				index=i;
				break;
			}
		}
		if(flag == true) {
			System.out.println("Input data is present at index "+index);
		}
		else {
			System.out.println("Data not present in array ");
		}
		
	}
	
	//reverse
	void reverse(int a[]) {
		int temp;
		for(int i=0;i<this.size/2;i++) {
			temp = a[i]  ;
			a[i] = a[this.size-i-1];
			a[this.size-i-1]= temp;
		}
		System.out.println("Reversed array : ");
		System.out.print("[");
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+",");
		}
		System.out.print("]");
	}
	
	//sort

	void sort() {
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					arr[j] = arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
			}
		}
	}
	
	//sum
	int sum() {
		int sum = 0;
		for(int i=0;i<size;i++) {
			sum = sum+arr[i];
		}
		return sum;
	}
	
	//average
	
	int average() {
		int sum = 0;
		for(int i=0;i<size;i++) {
			sum = sum+arr[i];
		}
		return sum/(size);
	}
	
	//concat
	
	void concat(array a , array b) {
		
		if(a.size() == 0 && b.size() == 0) {
			System.out.println("you passed an empty array");
		}
		else {
			if(a.size!=0 && b.size==0) {
				System.out.println("second array is empty");
				int c[] = new int[a.size];
				for(int i=0;i<a.size;i++) {
					c[i] = a.arr[i];
					System.out.print(c[i]+" ");
				}
			}
			else if(a.size==0 && b.size!=0) {
				System.out.println("first array is empty");
				int c[] = new int[b.size];
				for(int i=0;i<b.size;i++) {
					c[i] = b.arr[i];
					System.out.print(c[i]+" ");
				}
			}
			else {
				int j=0;
				int c[] = new int[a.size+b.size];
				System.out.println("Concatanated Array :");
				for(int i=0;i<a.size;i++) {
					c[j]=a.arr[i];
					System.out.print(c[j]+" ");
					j++;
				}
				for(int i=0;i<b.size;i++) {
					c[j]=b.arr[i];
					System.out.print(c[j]+" ");
					j++;
				}
			}
		}
		
	}

}
