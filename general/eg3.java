// Recursive Fibonacci
import java.util.*;
class eg3psp
{
public static int fibo(int k)
{
if(k<=1) return k;
return fibo(k-1)+fibo(k-2);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the nth number : ");
int k=sc.nextInt();
System.out.println("The nth fibonacci number is : "+fibo(k));
}
}