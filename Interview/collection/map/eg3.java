/*
TREE MAP:
A Red-Black tree based NavigableMap implementation. 
The map is sorted according to the natural ordering of its keys, or by 
a Comparator provided at map creation time, depending on which 
constructor is used.This implementation provides guaranteed log(n) 
time cost for the containsKey, get, put and remove operations. 
*/
import java.util.*;
class eg3psp
{
public static void main(String gg[])
{
Map<Integer,String> treeMap=new TreeMap<>();
treeMap.put(200,"Ishi");
treeMap.put(1,"Ishwar");
treeMap.put(5000,"Ashok");
System.out.println(treeMap.size());
System.out.println(treeMap.values());
// Traverse way
for(Map.Entry e:treeMap.entrySet())
{
System.out.println(e.getKey()+":"+e.getValue());
}
}
}