// Print all subsequences of an array for all possible combinations
import java.lang.*;
import java.util.*;
class eg1psp
{
public static void main(String args[])
{
int[] x={65,66,67,68};
int size=x.length;
int upperBoundX=size-1;
int xEP=(int)((Math.pow(2,size))-1);
int num1=1;
while(num1<=xEP)
{
for(int e=upperBoundX;e>=0;e--)
{
int j=num1>>e;
if((j&1)==1) System.out.print((char)(x[upperBoundX]-e));
}
System.out.println();
num1++;
}
}
}