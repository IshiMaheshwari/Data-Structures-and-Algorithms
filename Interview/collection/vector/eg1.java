/*
VECTOR:
Vector implements a dynamic array that means it can grow or shrink as 
required. Like an array, it contains components that can be accessed 
using an integer index.They are very similar to Vector but Vector is
synchronized and has some legacy method that the collection framework 
does not contain.It also maintains an insertion order like an Vector
but it is rarely used in a non-thread environment as it is synchronized 
and due to which it gives a poor performance in adding, searching, 
delete and update of its elements.
The Iterators returned by the Vector class are fail-fast. In the case 
of concurrent modification,it fails and throws the 
ConcurrentModificationException.*/

import java.util.*;
class eg1psp
{
public static void main(String gg[])
{
Vector<String> vector=new Vector<String>();
vector.add("ishi");
vector.add("maheshwari");
vector.add("loves to");
vector.add("do Coding");
// for Each loop
for(String i:vector)
{
System.out.println(i);
}
System.out.println("Data at 0th index: "+vector.get(0));
System.out.println(vector.elementAt(2));
System.out.println("Capacity: "+vector.capacity());
System.out.println("Size: "+vector.size());
System.out.println(vector.contains("is"));
vector.remove("is");
Collections.sort(vector);
vector.forEach(System.out::println);
}
}
