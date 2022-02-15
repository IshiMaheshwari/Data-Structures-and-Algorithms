// Design a program to remove an element/elements (the number can be
// present multiple times) from linked list and return new head.
class eg2psp
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
Node n2=new Node(10);
Node n3=new Node(20);
Node n4=new Node(10);
Node n5=new Node(30);
Node n6=new Node(10);
Node n7=new Node(10);
Node n8=new Node(40);
Node n9=new Node(10);
Node n10=new Node(50);
head=n1;
n1.next=n2;
n2.next=n3;
n3.next=n4;
n4.next=n5;
n5.next=n6;
n6.next=n7;
n7.next=n8;
n8.next=n9;
n9.next=n10;
return head;
}
public static Node removeElement(Node head,int num)
{
Node p1=new Node();
Node p2=new Node();
while(head!=null && num==head.data)
{
p1=head;
head=head.next;
}
if(head==null) return null;
p1=head.next;
p2=head;
while(p1!=null)
{
if(p1.data==num)
{
p2.next=p1.next;
p1=p2.next;
}
else
{
p2=p1;
p1=p1.next;
}
}
return head;
}
public static void main(String args[])
{
Node head;
Node t;
head=createLinkedList();
for(t=head;t!=null;t=t.next) System.out.println(t.data);
System.out.println("----------------------------");
head=removeElement(head,10);
for(t=head;t!=null;t=t.next) System.out.println(t.data);
}
}