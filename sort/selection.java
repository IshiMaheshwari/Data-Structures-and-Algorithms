import java.util.*;
class selection
{
public static void main(String args[])
{
int[] x={100,90,80,70,60,50,40,30,20,10};
int size=x.length;
int si,g;
for(int e=0;e<=size-2;e++)
{
si=e;
for(int f=e+1;f<=size-1;f++)
{
if(x[f]<x[e])
{
si=f;
}
}
g=x[si];
x[si]=x[e];
x[e]=g;
}
System.out.println(Arrays.toString(x));
}
}