import java.util.*;
class eg1psp
{
public static class Node
{
int data;
Node next;
Node prev;
public Node(int data)
{
this.data=data;
this.next=null;
this.prev=null;
}
}
static Node head=null;
static Node tail=null;

static void addAtEnd(int data)
{
Node t=new Node(data);
if(head==null) 
{
head=tail=t;
}
else
{
tail.next=t;
t.prev=tail;
tail=t;
}
}
static void insertAtTop(int data)
{
Node t=new Node(data);
if(head==null)
{
head=tail=t;
return;
}
t.next=head;
head.prev=t;
head=t;
}
static void insertAtPosition(int data,int pos)
{
Node t=new Node(data);
if(pos<1) pos=1;
if(head==null)
{
head=tail=t;
return;
}
Node k=head;
int x=1;
while(k!=null && x<pos)
{
k=k.next;
x++;
}
if(k==head) // insert at top
{
t.next=head;
head.prev=t;
head=t;
return;
}
if(k==null) // insert at end
{
tail.next=t;
t.prev=tail;
tail=t;
return;
}
// now it is in the middle
t.next=k;
t.prev=k.prev;
k.prev.next=t;
k.prev=t;
}
static void removeFrom(int pos)
{
int x;
if(pos<1) return;
x=1;
Node k=head;
while(k!=null && x<pos)
{
k=k.next;
x++;
}
// only one node
if(k==head && k==tail)
{
head=tail=null;
return;
}

// many but first
if(k==head)
{
head=head.next;
head.prev=null;
return;
}

// many but last
if(k==tail)
{
tail=tail.prev;
tail.next=null;
return;
}
// neither first nor last
k.prev.next=k.next;
k.next.prev=k.prev;
}
static void traverseTopToBottom()
{
Node t;
for(t=head;t!=null;t=t.next) System.out.println(t.data);
}
static void traverseBottomToTop()
{
Node t;
for(t=tail;t!=null;t=t.prev) System.out.println(t.data);
}

public static void main(String gg[])
{
int ch,num,pos;
while(true)
{
Scanner sc=new Scanner(System.in);
System.out.println("1. Add at end");
System.out.println("2. Insert at top");
System.out.println("3. Insert at position");
System.out.println("4. Remove");
System.out.println("5. Traverse top to bottom");
System.out.println("6. Traverse bottom to top");
System.out.println("7. End");
System.out.print("Enter your requirement : ");
ch=sc.nextInt();
if(ch==1)
{
System.out.print("Enter a number : ");
num=sc.nextInt();
addAtEnd(num);
}
if(ch==2)
{
System.out.print("Enter a number : ");
num=sc.nextInt();
insertAtTop(num);
}
if(ch==3)
{
System.out.print("Enter a number : ");
num=sc.nextInt();
System.out.print("Enter the position at which number should be added : ");
pos=sc.nextInt();
insertAtPosition(num,pos);
// taking index from 1
}
if(ch==4)
{
System.out.print("Enter position to be removed : ");
pos=sc.nextInt();
removeFrom(pos);
}
if(ch==5)
{
traverseTopToBottom();
}
if(ch==6)
{
traverseBottomToTop();
}
if(ch==7) System.exit(0);
}
}
}