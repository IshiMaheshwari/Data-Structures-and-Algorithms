import java.util.*;
class PancakeSort
{
public static void reverse(int []x,int index)
{
int i=0;
int g;
if(i<index)
{
g=x[i];
x[i]=x[index];
x[index]=g;
i++;
index--;
}
}
public static int findLargestIndex(int []x,int n)
{
int largestIndex=0;
for(int i=0;i<n;i++)
{
if(x[i]>x[largestIndex]) largestIndex=i;
}
return largestIndex;
}
static void pancakeSort(int []x,int total)
{
for(int size=total;size>1;size--)
{
int largestIndex=findLargestIndex(x,size);
if(largestIndex!=size-1)
{
reverse(x,largestIndex);
reverse(x,size-1);
}
}
}
public static void main(String args[])
{
int x[]={20,32,3,90,65,431,56,6,12,0};
int size=x.length;
pancakeSort(x,size);
System.out.println(Arrays.toString(x));
}
}