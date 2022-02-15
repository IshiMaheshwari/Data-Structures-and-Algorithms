import java.util.*;
class QuickSort
{
public static int findPartitionPoint(int []x,int lb,int ub)
{
int e,f,g;
e=lb;
f=ub;
while(e<f)
{
while(e<ub && x[e]<=x[lb]) e++;
while(x[f]>x[lb]) f--;
if(e<f)
{
g=x[e];
x[e]=x[f];
x[f]=g;
}
else
{
g=x[lb];
x[lb]=x[f];
x[f]=g;
}
}
return f;
}
public static void quickSort(int []x,int lb,int ub)
{
int pp;
if(ub<=lb) return;
pp=findPartitionPoint(x,lb,ub);
quickSort(x,lb,pp-1);
quickSort(x,pp+1,ub);
}
public static void main(String args[])
{
int x[]={100,90,80,70,60,50,40,30,20,10};
quickSort(x,0,9);
System.out.println(Arrays.toString(x));
}
}