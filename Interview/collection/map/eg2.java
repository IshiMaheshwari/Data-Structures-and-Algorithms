/* LINKED HASH MAP:
The LinkedHashMap is just like LinkedHashMap with an additional feature of 
maintaining an order of elements inserted into it. LinkedHashMap provided the 
advantage of quick insertion, search, and deletion but it never 
maintained the track.
It contains only unique elements.
It may have one null key and multiple null values.
It is non-synchronized.

*/
import java.util.*;
class eg2psp
{
public static void main(String gg[])
{
Map<Integer,String> linkedHashMap=new LinkedHashMap<>();
linkedHashMap.put(200,"Ishi");
linkedHashMap.put(1,"Ishwar");
linkedHashMap.put(5000,"Ashok");
System.out.println(linkedHashMap.size());
System.out.println(linkedHashMap.values());
// Traverse way
for(Map.Entry e:linkedHashMap.entrySet())
{
System.out.println(e.getKey()+":"+e.getValue());
}
// Sort by key
linkedHashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
// Sort by value
linkedHashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

}
}