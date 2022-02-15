import java.lang.*;
import java.util.*;
class eg2psp
{
public static void main(String args[])
{
int y[]={66,90,68};
int size=y.length;
int upperBoundY=size-1;
int yEP=(int)((Math.pow(2,size))-1);
int num2=1;
while(num2<=yEP)
{
for(int e=upperBoundY;e>=0;e--)
{
int j=num2>>e;
if((j&1)==1) System.out.print((char)(y[upperBoundY-e])); 
// change in above line
}
System.out.println();
num2++;
}
}
}