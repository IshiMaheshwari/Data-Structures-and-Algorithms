import java.util.*;
class BinaryInsertionSort
{
public static int binarySearch(int[] x,int num,int low,int high)
{
while(low<=high)
{
int mid=low+(high-low)/2;
if(x[mid]==num) break;
if(num<x[mid])
{
high=mid-1;
}
else
{
low=mid+1;
}
}
return low;
}
public static void binaryInsertionSort(int[] x,int size)
{
int indexToBeInsertedOn,i,y,num;
for(i=1;i<size;i++)
{
y=i-1;
num=x[i];
indexToBeInsertedOn=binarySearch(x,num,0,y);
while(y>=indexToBeInsertedOn)
{
x[y+1]=x[y];
y--;
}
x[y+1]=num;
}
}
public static void main(String args[])
{
int x[]={32,65,765,2,5,98,5,9,43,72};
int size=x.length;
binaryInsertionSort(x,size);
System.out.println(Arrays.toString(x));
}
}