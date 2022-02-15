/*
STACK:
The Stack class represents a last-in-first-out (LIFO) stack of objects.
 It extends class Vector with five operations that allow a vector to be
 treated as a stack. The usual push and pop operations are provided, as
 well as a method to peek at the top item on the stack, a method to test
 for whether the stack is empty, and a method to search the stack for an
 item and discover how far it is from the top.
When a stack is first created, it contains no items.
 Stack class in Java is a legacy class and inherits from Vector in Java.
 It is a thread-safe class and hence involves overhead when we do not 
need thread safety. It is recommended to use ArrayDeque for stack 
implementation as it is more efficient in a single-threaded environment.
*/

import java.util.*;
class eg1psp
{
public static void main(String gg[])
{
Stack<Integer> stack=new Stack<Integer>();
stack.push(2000);
stack.push(1843);
stack.push(21133);
stack.push(1234);
// for Each loop
System.out.println(stack.search(1843)); // from top of stack
System.out.println(stack);
stack.pop();
Collections.sort(stack);
System.out.println(stack);
stack.pop();
stack.pop();
stack.pop();
System.out.println(stack.empty());
}
}
