// GCD and LCM of n numbers
import java.util.*;
class eg7psp
{
public static int euclideanAlgorithm(int p,int q)
{
if(q==0) return p;
return euclideanAlgorithm(q,p%q);
}
public static int findLCM(int[] x,int size)
{
int lcm=x[0];
for(int i=0;i<size;i++)
{
lcm=((x[i]*lcm)/(euclideanAlgorithm(x[i],lcm)));
}
return lcm;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x[]={4,2,6,8,10};
int size=x.length;
int lcm=findLCM(x,size);
System.out.println("LCM is : "+lcm);
}
}