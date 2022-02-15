// Binary search
class eg17psp
{
public static int indexOf(int num,int x[],int size)
{
int lb=0;
int ub=size-1;
int mid;
while(lb<=ub)
{
mid=lb+((ub-lb)/2); // when lb index is not zero
if(x[mid]==num) return mid;
if(num>x[mid]) lb=mid+1;
else ub=mid-1;
}
return -1;
}
public static void main(String gg[])
{
int x[]={2,3,6,7,9};
int index=indexOf(7,x,x.length);
if(index==-1) System.out.println("7 is not part of collection");
else System.out.println("Element found at index : "+index);
}
}