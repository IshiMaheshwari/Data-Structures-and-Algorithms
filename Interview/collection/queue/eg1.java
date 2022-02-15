/*
ARRAY DEQUE:
ArrayDeque class which is implemented in the collection framework 
provides us with a way to apply resizable-array. This is a special kind 
of array that grows and allows users to add or remove an element from 
both sides of the queue. Array deques have no capacity restrictions and 
they grow as necessary to support usage. They are not thread-safe which 
means that in the absence of external synchronization, ArrayDeque does 
not support concurrent access by multiple threads. ArrayDeque class is 
likely to be faster than Stack when used as a stack. Array
Deque class is likely to be faster than LinkedList when used as a queue.
*/
import java.util.*;
class eg1psp
{
public static void main(String gg[])
{
Deque<Integer> dq=new ArrayDeque<Integer>();
System.out.println(dq.offerFirst(10));
System.out.println(dq.offerLast(100));
System.out.println(dq.offerFirst(20));
System.out.println(dq);
dq.pop();
dq.pop();
System.out.println(dq);
System.out.println(dq.size());
}
}