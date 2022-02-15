// 14. Merge two sorted lists.
class eg1psp
{
static public class Node
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
public static Node createLinkedList(int[] x,int size)
{
Node head,end;
int i;
head=null;
end=null;
for(i=0;i<size;i++)
{
Node t=new Node(x[i]);
if(head==null)
{
head=end=t;
}
else
{
end.next=t;
end=t;
}
}
return head;
}
public static Node mergeLinkedList(Node head1,Node head2)
{
Node head3,end3,t1,t2,j;
head3=end3=null;
t1=head1;
t2=head2;
while(t1!=null && t2!=null)
{
if(t1.data<=t2.data)
{
j=t1;
t1=t1.next;
}
else
{
j=t2;
t2=t2.next;
}
j.next=null;
if(head3==null)
{
head3=end3=j;
}
else
{
end3.next=j;
end3=j;
}
}
if(t1==null) end3.next=t2;
if(t2==null) end3.next=t1;
return head3;
}
public static void main(String args[])
{
Node head1,head2,head3,t;
int x[]={10,20,30,40,50,60,70};
int y[]={15,25,35,45,55,67,78,90,100,120};
head1=createLinkedList(x,7);
head2=createLinkedList(y,10);
head3=mergeLinkedList(head1,head2);
for(t=head3;t!=null;t=t.next) System.out.println(t.data);
}
}