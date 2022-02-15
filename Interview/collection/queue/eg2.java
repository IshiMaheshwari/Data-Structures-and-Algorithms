/*
PRIORITY QUEUE:
A PriorityQueue is used when the objects are supposed to be processed
 based on the priority. It is known that a Queue follows the First-In-
First-Out algorithm, but sometimes the elements of the queue are needed
 to be processed according to the priority, that’s when the 
PriorityQueue comes into play. The PriorityQueue is based on the 
priority heap. The elements of the priority queue are ordered according
 to the natural ordering, or by a Comparator provided at queue 
construction time,depending on which constructor is used.

1. PriorityQueue doesn’t permit null.
2. We can’t create PriorityQueue of Objects that are non-comparable
3. PriorityQueue are unbound queues.
4. The head of this queue is the least element with respect to the 
specified ordering. If multiple elements are tied for least value,
 the head is one of those elements — ties are broken arbitrarily.
5. Since PriorityQueue is not thread-safe, so java provides 
PriorityBlockingQueue class that implements the BlockingQueue 
interface to use in java multithreading environment.
6. The queue retrieval operations poll,  remove,  peek, and element 
access the element at the head of the queue.
7. It provides O(log(n)) time for add and poll methods.
8. It inherits methods from AbstractQueue, AbstractCollection, 
Collection and Object class.
*/
import java.util.*;
class eg2psp
{
public static void main(String gg[])
{
PriorityQueue<String> pq=new PriorityQueue<String>();
pq.add("ishi");
pq.add("good");
pq.add("girl");
pq.add("ishwar");
pq.add("boy");
System.out.println(pq.size());
Iterator itr=pq.iterator();
while(itr.hasNext()) System.out.println(itr.next());
pq.poll();
System.out.println(pq);
pq.remove("good");
System.out.println(pq);
}
}