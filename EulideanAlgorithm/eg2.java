//Eulidean Algorithm
import java.util.*;
class eg2psp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number : ");
int x=sc.nextInt();
System.out.print("Enter another number : ");
int y=sc.nextInt();
int rem=1;
if(x>y)
{
while(rem!=0)
{
rem=x%y;
x=y;
y=rem;
}
System.out.println("GCD is : "+x);
}
else
{
while(rem!=0)
{
rem=y%x;
y=x;
x=rem;
}
System.out.println("GCD is : "+y);
}
}
}