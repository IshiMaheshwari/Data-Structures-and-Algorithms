// GCD n numbers
import java.util.*;
class eg6psp
{
public static int euclideanAlgorithm(int p,int q)
{
if(q==0) return p;
return euclideanAlgorithm(q,p%q);
}
public static int findHCF(int[] x,int size)
{
int result=x[0];
for(int i=0;i<size;i++)
{
result=euclideanAlgorithm(x[i],result);
}
return result;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x[]={100,200,30,400,500};
int size=x.length;
int gcd=findHCF(x,size);
System.out.println("GCD is : "+gcd);
}
}