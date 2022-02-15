// Reverse a SLL
class eg3psp
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
public static Node createLinkedList()
{
Node head=new Node();
Node n1=new Node(10);
Node n2=new Node(20);
Node n3=new Node(30);
Node n4=new Node(40);
Node n5=new Node(50);
head=n1;
n1.next=n2;
n2.next=n3;
n3.next=n4;
n4.next=n5;
return head;
}
public static Node reverseLinkedList(Node head)
{
Node newHead=null;
Node t;
while(head!=null)
{
t=head;
head=head.next;
t.next=newHead;
newHead=t;
}
return newHead;
}
public static void main(String args[])
{
Node head=new Node();
Node t=new Node();
head=createLinkedList();
System.out.println("Linked list");
for(t=head;t!=null;t=t.next) System.out.println(t.data);
head=reverseLinkedList(head);
System.out.println("Reversed Linked list");
for(t=head;t!=null;t=t.next) System.out.println(t.data);
}
}