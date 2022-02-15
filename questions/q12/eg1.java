// Reverse a singly linked list
import java.util.*;
class eg1psp
{
public static void main(String args[])
{
LinkedList<Integer> ll=new LinkedList<>();
ll.add(10);
ll.add(20);
ll.add(30);
ll.add(40);
ll.add(50);
System.out.println("Linked list : "+ll);
Collections.reverse(ll);
System.out.println("Linked list reversed: "+ll);
}
}