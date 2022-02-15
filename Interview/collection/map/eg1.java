/*HASH MAP:
It stores the data in (Key, Value) pairs, and you can access them by an
index of another type (e.g. an Integer). One object is used as a key 
(index) to another object (value). If you try to insert the duplicate 
key, it will replace the element of the corresponding key.

HashMap is similar to HashTable, but it is unsynchronized. It allows to
store the null keys as well, but there should be only one null key 
object and there can be any number of null values.This class makes no
guarantees as to the order of the map. */

import java.util.*;
class eg1psp
{
public static void main(String gg[])
{
Map<Integer,String> hashMap=new HashMap<>();
hashMap.put(200,"Ishi");
hashMap.put(1,"Ishwar");
hashMap.put(5000,"Ashok");
System.out.println(hashMap); 
System.out.println(hashMap.containsKey(20));
System.out.println(hashMap.entrySet());
System.out.println(hashMap.keySet());
System.out.println(hashMap.get(200));
System.out.println(hashMap.isEmpty());
System.out.println(hashMap.remove(5000));
System.out.println(hashMap);
hashMap.put(1,"Suresh");
hashMap.put(2,"Suresh");
System.out.println(hashMap);
System.out.println(hashMap.size());
System.out.println(hashMap.values());
// Iterating over it
for(Integer e:hashMap.keySet())
{
System.out.print(e+" : ");
System.out.println(hashMap.get(e));
}
// Better way
for(Map.Entry e:hashMap.entrySet())
{
System.out.println(e.getKey()+":"+e.getValue());
}
}
}