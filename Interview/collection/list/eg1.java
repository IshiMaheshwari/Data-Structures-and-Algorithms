/*
ARRAY LIST:
1. ArrayList is initialized by the size. However, the size is increased 
automatically if the collection grows or shrinks if the objects are 
removed from the collection.
2. Java ArrayList allows us to randomly access the list.
3. ArrayList can not be used for primitive types, like int, char, etc. 
We need a wrapper class for such cases.
4. ArrayList in Java can be seen as a vector in C++.
5. ArrayList is not Synchronized. Its equivalent synchronized class in 
Java is Vector.
*/
import java.util.*;
class eg1psp
{
public static void main(String gg[])
{
ArrayList<String> arrayList=new ArrayList<String>();
arrayList.add("ishi");
arrayList.add("maheshwari");
arrayList.add("loves to");
arrayList.add("do Coding");
// for Each loop
for(String i:arrayList)
{
System.out.println(i);
}
System.out.println("Data at 0th index: "+arrayList.get(0));

System.out.println("Size: "+arrayList.size());
System.out.println(arrayList.contains("is"));
arrayList.remove("is");
Collections.sort(arrayList);
arrayList.forEach(System.out::println);
}
}