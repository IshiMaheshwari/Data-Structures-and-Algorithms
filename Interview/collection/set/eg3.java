// LINKED HASH SET: A LinkedHashSet is very similar to a HashSet. 
// The difference is that this uses a doubly linked list to 
// store the data and retains the ordering of the elements
import java.util.*;
class eg3psp
{
public static void main(String gg[])
{
LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
linkedHashSet.add("Ishi");
linkedHashSet.add("is");
linkedHashSet.add("Ishi");
linkedHashSet.add("Maheshwari");
// for Each loop
for(String i:linkedHashSet)
{
System.out.println(i);
}
System.out.println("Size: "+linkedHashSet.size());
System.out.println(linkedHashSet.contains("is"));
System.out.println(linkedHashSet.remove("is"));
linkedHashSet.forEach(System.out::println);
}
}