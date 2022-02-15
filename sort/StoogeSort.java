import java.util.*;
class StoogeSort
{
public static void stoogeSort(int[] x,int lb,int ub)
{
int g;
if(x[lb]>x[ub])
{
g=x[lb];
x[lb]=x[ub];
x[ub]=g;
}
if((ub-lb+1)>2)
{
int y=(ub-lb+1)/3;
stoogeSort(x,lb,ub-y);
stoogeSort(x,lb+y,ub);
stoogeSort(x,lb,ub-y);
}
}
public static void main(String args[])
{
int x[]={12,6,43,7,76,3,65,2,75,1};
int length=x.length;
stoogeSort(x,0,length-1);
System.out.println(Arrays.toString(x));
}
}