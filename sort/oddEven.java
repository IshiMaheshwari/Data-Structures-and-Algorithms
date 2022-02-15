import java.util.*;
class OddEven
{
public static void oddEvenSort(int []x,int size)
{
boolean swapCount=true;
int g;
while(swapCount)
{
swapCount=false;
for(int i=0;i<size;i=i+2)
{
if(x[i+1]<x[i])
{
g=x[i];
x[i]=x[i+1];
x[i+1]=g;
swapCount=true;
}
}
for(int i=1;i<size;i=i+2)
{
if(x[i+1]<x[i])
{
g=x[i];
x[i]=x[i+1];
x[i+1]=g;
swapCount=true;
}
}
}
}
public static void main(String args[])
{
int x[]={43,7,76,32,210,6,75,17,56,98};
int size=x.length;
oddEvenSort(x,size-1);
System.out.println(Arrays.toString(x));
}
}