import java.util.*;
class CocktailShakerSort
{
public static void cocktailShakerSort(int[] x,int lb,int ub)
{
boolean swapCount=true;
int g;
while(swapCount)
{
swapCount=false;
for(int i=lb;i<ub;i++)
{
if(x[i+1]<x[i])
{
g=x[i+1];
x[i+1]=x[i];
x[i]=g;
swapCount=true;
}
}
ub=ub-1;
if(swapCount==false) break;
for(int i=ub;i>=lb;i--)
{
if(x[i]>x[i+1])
{
g=x[i];
x[i]=x[i+1];
x[i+1]=g;
swapCount=true;
}
}
lb=lb+1;
}
}
public static void main(String gg[])
{
int x[]={43,65,1,53,5,43,76,9,7,6};
int size=x.length;
cocktailShakerSort(x,0,size-1);
System.out.println(Arrays.toString(x));
}
}