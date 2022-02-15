// Design a program to remove an element/elements (the number can be
// present multiple times) from linked list and return new head.
import java.util.*;
class eg1psp
{
public static void main(String args[])
{
LinkedList<String> ll=new LinkedList<>();
ll.add("10");
ll.add("20");
ll.add("10");
ll.add("10");
ll.add("40");
ll.add("10");
ll.add("60");
System.out.println("Linked list : "+ll);
ArrayList<String> arr=new ArrayList<>();
arr.add("10");
ll.removeAll(arr);
System.out.println("Linked list : "+ll);
System.out.println("New Head : "+ll.getFirst());
}
}