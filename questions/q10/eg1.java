// Find the given linked list is palindrome or not
import java.util.*;
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
Node n4=new Node(20);
Node n5=new Node(20);
start=n1;
n1.next=n2;
n2.next=n3;
n3.next=n4;
n4.next=n5;
}
public static boolean isPallindrome(Node b)
{
Node p1=b;
boolean isPalindrome=true;
Stack<Integer> stack=new Stack<Integer>();
while(p1!=null)
{
stack.push(p1.data);
p1=p1.next;
}
while(b!=null)
{
int i=stack.pop();
if(b.data==i) isPalindrome=true;
else
{
isPalindrome=false;
break;
}
b=b.next;
}
return isPalindrome;
}
public static void main(String args[])
{
createLinkedList();
System.out.println("Is Pallindrome : "+isPallindrome(start));
}
}