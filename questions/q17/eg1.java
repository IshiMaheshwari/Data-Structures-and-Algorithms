// Search for an element using binary search
class eg1psp
{
public static int indexOf(int num,int x[],int low,int high)
{ 
if(low>high) return -1;
int mid=low+((high-low)/2); 
if(x[mid]==num) return mid;
if(num>x[mid]) return indexOf(num,x,mid+1,high);
else return indexOf(num,x,0,mid-1);
}
public static void main(String gg[])
{
int x[]={2,3,6,7,9};
int index=indexOf(17,x,0,x.length-1);
if(index==-1) System.out.println("17 is not part of collection");
else System.out.println("Element found at index : "+index);
}
}