// GCD of 3 numbers
import java.util.*;
class eg4psp
{
public static int euclideanAlgorithm(int p,int q)
{
if(q==0) return p;
return euclideanAlgorithm(q,p%q);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter 1 number : ");
int x=sc.nextInt();
System.out.print("Enter 2 number : ");
int y=sc.nextInt();
System.out.print("Enter 3 number : ");
int z=sc.nextInt();
int gcd=euclideanAlgorithm(x,y);
gcd=euclideanAlgorithm(gcd,z);
System.out.println("GCD is : "+gcd);
}
}