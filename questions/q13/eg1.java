// Remove duplicates from sorted singly linked list
class eg1psp
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
Node head;
Node n1=new Node(10);
Node n2=new Node(10);
Node n3=new Node(10);
Node n4=new Node(20);
Node n5=new Node(30);
Node n6=new Node(30);
Node n7=new Node(32);
Node n8=new Node(40);
Node n9=new Node(40);
Node n10=new Node(100);
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
public static Node removeDuplicates(Node head)
{
Node p1,p2,j,t;
p1=p2=head;
while(p2!=null)
{
p1=p2;
while(p1!=null && p1.data==p2.data) p1=p1.next;
t=p2.next;
while(t!=p1)
{
j=t;
t=t.next;
}
p2.next=p1;
p2=p1;
}
return head;
}
public static void main(String args[])
{
Node head;
Node t;
head=createLinkedList();
for(t=head;t!=null;t=t.next) System.out.println(t.data);
System.out.println("----------------------------------");
Node newHead=removeDuplicates(head);
for(t=newHead;t!=null;t=t.next) System.out.println(t.data);
}
}