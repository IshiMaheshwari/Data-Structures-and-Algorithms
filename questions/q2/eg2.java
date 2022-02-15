class eg2psp
{
public static int findMissingNumber(int[] x,int smallest,int largest)
{
int size=x.length;
int smallestSum=(smallest*(smallest+1))/2;
int largestSum=(largest*(largest+1))/2;
int sum=0;
for(int e=0;e<size;e++) sum+=x[e];
return (largestSum-smallestSum)-sum;
}
public static void main(String args[])
{
int x[]={16,12,11,14,15};
int smallest=11-1;
int largest=16;
System.out.println(findMissingNumber(x,smallest,largest));
}
}