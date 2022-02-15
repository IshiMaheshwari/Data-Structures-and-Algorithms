// Eulidean Recursive
import java.util.*;
class eg3psp
{
public static int eulideanAlgorithm(int p,int q)
{
if(q==0) return p;
return eulideanAlgorithm(q,p%q);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number : ");
int x=sc.nextInt();
System.out.print("Enter another number : ");
int y=sc.nextInt();
System.out.println("GCD is : "+eulideanAlgorithm(x,y));
}
}