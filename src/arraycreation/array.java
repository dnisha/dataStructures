package arraycreation;

public class array {
int capacity; // total elements an array can hold
int[] arr; //declaration of array
int size; // current status of elements
public array()
{
capacity=5;
arr=new int[capacity];
size=0;
}
public array(int c)
{
capacity=c;
arr=new int[capacity];
size=0;
}
void add(int x) // add at the end one element
{
if(size<capacity)
{
arr[size]=x;
size++;
}
else
{
System.out.println("can't insert new elements");
}
//capacity++;
}
void display()
{
System.out.print("[");
for(int i=0;i<capacity;i++)
{
System.out.print(" "+arr[i]);
}
System.out.println("]");
}
int count()
{
return size;
}

void remove()//delete from last only one element
{
if(size!=-1)
{
arr[size-1]=0;
size--;
}
else
{
System.out.println("can't delete array empty");
}
}

void insertbetween(int pos,int data)
{
if(size<capacity)
{
for(int i=size;i>pos;i--)
{
arr[i]=arr[i-1];
}
arr[pos]=data;
size++;
}
else
{
System.out.println("can't insert new elements");
}
}

void deletebetween(int pos)
{
if(pos>-1||pos<size)
{
if(size==1)
{
arr[0]=0;
}
else
{
for(int i=pos;i<size;i++)
{
arr[i]=arr[i+1];
}
}
size--;
}
else
{
System.out.println("can't delete array empty");
}
}
}