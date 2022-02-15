// Hash SET:
//The objects that we insert into the HashSet do not guarantee to be 
//inserted in the same order. The objects are inserted based on 
//their hashcode.This class also allows the insertion of NULL elements.
import java.util.*;
class eg1psp
{
public static void main(String gg[])
{
Set<Integer> hashSet=new HashSet<Integer>();
hashSet.add(1000321);
hashSet.add(2432432);
hashSet.add(1000432);
hashSet.add(3232421);
hashSet.add(1544353);
hashSet.add(6323232);
// iterator method
Iterator itr=hashSet.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
hashSet.remove(6323232);
/*
// for Each loop
for(int i:hashSet)
{
System.out.println(i);
}
*/
System.out.println("Size: "+hashSet.size());
System.out.println(hashSet.contains(10));
List<Integer> list=new ArrayList<Integer>(hashSet);
Collections.sort(list);
// Lambda Expression
list.forEach(System.out::println);
}
}