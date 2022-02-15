import java.util.*;
class GnomeSort
{
public static void gnomeSort(int x[],int size)
{
int i=0;
int g;
while(i<size)
{
if(i==0) i=i+1;
if(x[i]<x[i-1])
{
g=x[i];
x[i]=x[i-1];
x[i-1]=g;
i--;
}
else
{
i++;
}
}
}
public static void main(String args[])
{
int x[]={12,4,76,34,766,23,90,50,100,1};
int size=x.length;
gnomeSort(x,size);
System.out.println(Arrays.toString(x));
}
}