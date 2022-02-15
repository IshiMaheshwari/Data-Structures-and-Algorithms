import java.util.*;
public class Prime
{
public static boolean isPrime(int num)
{
int n=num/2;
for(int i=2;i<=n;i++)
{
if(num%i==0) return false;
}
return true;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number to check it is prime or not : ");
int num=sc.nextInt();
if(isPrime(num)==true) System.out.println("Is a prime number");
else System.out.println("Not a prime number ");
}
}