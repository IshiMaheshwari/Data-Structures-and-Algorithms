// TREE SET:
//The TreeSet class uses a Tree for storage. The 
//ordering of the elements is maintained by a set using
//their natural ordering whether or not an explicit 
//comparator is provided. This implementation provides guaranteed 
//log(n) time cost for the basic operations (add, remove and contains).

import java.util.*;
class eg2psp
{
public static void main(String gg[])
{
TreeSet<String> treeSet=new TreeSet<String>();
treeSet.add("Ishi");
treeSet.add("is");
treeSet.add("Ishi");
treeSet.add("Maheshwari");
// for Each loop
for(String i:treeSet)
{
System.out.println(i);
}
System.out.println("Size: "+treeSet.size());
System.out.println(treeSet.contains("is"));
System.out.println(treeSet.descendingSet());// returns reverse order
System.out.println(treeSet.first());
System.out.println(treeSet.last());
System.out.println(treeSet.size());
System.out.println(treeSet.remove("is"));
treeSet.forEach(System.out::println);
}
}