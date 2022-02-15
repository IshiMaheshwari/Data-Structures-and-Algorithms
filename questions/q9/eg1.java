// Find the middle element in the given linked list
public class eg1
{
static class Node
{
int data;
Node next;
Node()
{
this.data=0;
this.next=null;
}
Node(int d)
{
this.data=d;
this.next=null;
}
}
static Node start=new Node();
public static void createLinkedList()
{
Node n1=new Node(10);
Node n2=new Node(20);
Node n3=new Node(30);
Node n4=new Node(40);
//Node n5=new Node(50);
start=n1;
n1.next=n2;
n2.next=n3;
n3.next=n4;
//n4.next=n5;
}
public static int getMiddleElement(Node b)
{
Node p1=new Node(); // fast pointer
Node p2=new Node(); // slow pointer
Node p3=new Node();
// For even no. of nodes then return the first middle one becoz 
// the p2.data in case of even will return 2nd one of the middle one
// so keeping track of p2 we require p3.
p1=b.next;
p2=b;
int count=1;
while(p1!=null)
{
p3=p2;
p2=p2.next;
if(p1.next==null)
{
count+=1;
break;
}
p1=p1.next.next;
count+=2;
}
System.out.println("Number of nodes present in linked list : "+count);
if(count%2==0) return p3.data;
return p2.data;
}
public static void main(String args[])
{
createLinkedList();
System.out.println("Middle element is : "+getMiddleElement(start));
}
}