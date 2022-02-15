// Detect loop in singly linked list
// By Floyd's Cycle Finding Algorithm
import java.util.*;
public class eg3
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
public static Node start=new Node();

public static void createLinkedList()
{
Node n1=new Node(10);
Node n2=new Node(20);
Node n3=new Node(30);
Node n4=new Node(40);
start=n1;
n1.next=n2;
n2.next=n3;
n3.next=n4;
// n4.next=n2;
}

public static boolean hasLoop(Node start)
{
Node p1=new Node();
Node p2=new Node();
if(start==null) return false;
p1=start.next;
p2=start;
if(p1==null || p1.next==null) return false;
while(p1!=p2)
{
if(p1==null || p1.next==null) return false;
p1=p1.next.next;
p2=p2.next;
}
return true;
}
public static void main(String args[])
{
createLinkedList();
if(hasLoop(start)) System.out.println("Loop is present");
else System.out.println("Loop is not present");
}
}