// GCD and LCM of 2 numbers
import java.util.*;
class eg5psp
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
int gcd=euclideanAlgorithm(x,y);
System.out.println("GCD is : "+gcd);
int lcm=(x*y)/gcd;
System.out.println("LCM is : "+lcm);
}
}