import java.util.*;
import java.io.*;
import java.lang.*;
public class SLL
{
public Node start=null;
class Node
{
int data;
Node next;
public Node()
{
this.data=0;
this.next=null;
}
public Node(int d)
{
this.data=d;
this.next=null;
}
}
public void addAtEnd(int data)
{
Node j;
Node t=new Node(data);
if(start==null)
{
start=t;
}
else
{
j=start;
while(j.next!=null) j=j.next;
j.next=t;
}
}

public void insertAtTop(int data)
{
Node t=new Node(data);
t.data=data;
t.next=start;
start=t;
}

public void insertAtPosition(int data,int pos)
{
Node p1;
Node p2=new Node();
Node t=new Node(data);
int x=1;
if(pos<0) pos=0;
if(start==null)
{
start=t;
return;
}
p1=start;
while(p1!=null && x<=pos)
{
p2=p1;
p1=p1.next;
x++;
}
if(p1==null)
{
p2.next=t;
return;
}
if(p1==start)
{
t.next=start;
start=t;
return;
}
p2.next=t;
t.next=p1;
}

public int removeFromPosition(int pos)
{
Node p1;
Node p2=new Node();
int x;
if(pos<0 || start==null) return -1;
for(x=1,p1=start;p1!=null && x<=pos;x++)
{
p2=p1;
p1=p1.next;
}
if(p1==null) return -1;
if(p1==start)
{
start=start.next;
}
else
{
p2.next=p1.next;
}
return pos;
}

public void traverseTopToBottom()
{
Node t;
for(t=start;t!=null;t=t.next)
{
System.out.println(t.data);
}
}

public void _traverseBottomToTop(Node t)
{
if(t==null) return;
_traverseBottomToTop(t.next);
System.out.println(t.data);
}
public void traverseBottomToTop()
{
_traverseBottomToTop(start);
}

public static void main(String args[])
{
int ch,num,pos;
Scanner sc=new Scanner(System.in);
SLL sll=new SLL();
while(true)
{
System.out.println("1. Add at end");
System.out.println("2. Insert at top");
System.out.println("3. Insert at position");
System.out.println("4. Remove");
System.out.println("5. Traverse top to bottom");
System.out.println("6. Traverse bottom to top");
System.out.println("7. Exit");
System.out.print("Enter your requirement : ");
ch=sc.nextInt();
if(ch==1)
{
System.out.print("Enter a number : ");
num=sc.nextInt();
sll.addAtEnd(num);
}
if(ch==2)
{
System.out.print("Enter a number : ");
num=sc.nextInt();
sll.insertAtTop(num);
}
if(ch==3)
{
System.out.print("Enter a number : ");
num=sc.nextInt();
System.out.print("Enter the position : ");
pos=sc.nextInt();
sll.insertAtPosition(num,pos);
}
if(ch==4)
{
System.out.print("Enter the index : ");
pos=sc.nextInt();
System.out.println("Removed Data at index : "+sll.removeFromPosition(pos));
}
if(ch==5)
{
sll.traverseTopToBottom();
}
if(ch==6)
{
sll.traverseBottomToTop();
}
if(ch==7)
{
System.exit(0);
}
}
} 
}