// Detect loop in singly linked list
// By modifying linked list DS
import java.util.*;
public class eg2
{
static class Node
{
int data;
int visited;
Node next;
Node()
{
this.data=0;
this.visited=0;
this.next=null;
}
Node(int d)
{
this.data=d;
this.visited=0;
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
n4.next=n2;
}

public static boolean hasLoop(Node start)
{
Node t=new Node();
t=start;
while(t!=null)
{
if(t.visited==1) return true;
t.visited=1;
t=t.next;
}
return false;
}
public static void main(String args[])
{
createLinkedList();
if(hasLoop(start)) System.out.println("Loop is present");
else System.out.println("Loop is not present");
}
}