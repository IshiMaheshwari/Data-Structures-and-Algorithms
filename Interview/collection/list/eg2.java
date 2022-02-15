/*
LINKED LIST:
Doubly-linked list implementation of the List and Deque interfaces. 
Implements all optional list operations, and permits all elements 
(including null).
All of the operations perform as could be expected for a doubly-linked 
list. Operations that index into the list will traverse the list from 
the beginning or the end, whichever is closer to the specified index.
*/
import java.util.*;
class eg2psp
{
public static void main(String gg[])
{
LinkedList<Integer> linkedList=new LinkedList<Integer>();
linkedList.add(57);
linkedList.add(12);
linkedList.add(19);
linkedList.add(39);
linkedList.add(60);
linkedList.add(19);
// for Each loop
for(Integer i:linkedList)
{
System.out.println(i);
}
System.out.println("Data at 0th index: "+linkedList.get(0));
System.out.println("Size: "+linkedList.size());
linkedList.remove(1);
Collections.sort(linkedList);
linkedList.set(2,1000);
linkedList.addFirst(20000);
linkedList.addLast(40000);
linkedList.forEach(System.out::println);
System.out.println("Index of 19 element : "+linkedList.indexOf(19));
// To convert list to Array
Integer[] myArr=new Integer[linkedList.size()];
linkedList.toArray(myArr);
for(int i=0;i<myArr.length;i++) System.out.println(myArr[i]);
System.out.println("-----");
System.out.println("Peek: "+linkedList.peek());
linkedList.forEach(System.out::println);
System.out.println("Poll: "+linkedList.poll());
linkedList.forEach(System.out::println);
System.out.println("-----");
linkedList.pop();
linkedList.push(1999);
linkedList.forEach(System.out::println);
}
}