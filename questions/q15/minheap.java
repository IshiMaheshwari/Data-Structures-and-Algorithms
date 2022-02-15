// BY DEFAULT PRIORITY QUEUE IS MIN-HEAP IN JAVA
import java.util.*;
class minheap
{
public static void main(String args[])
{
PriorityQueue<Integer,Integer> pq=new PriorityQueue<>();
pq.add(20,30);
pq.add(15,20);
pq.add(7,10);
pq.add(27,90);
pq.add(32,56);
while(pq.isEmpty()==false)
{
System.out.println(pq.poll());
}
}
}