// Find the missing number without duplicates
class eg1psp
{
public static int findMissingNumber(int[] x,int size)
{
int sum=0;
int n=size;
for(int e=0;e<size;e++) sum+=x[e];
return ((n*(n+1))/2)-sum;
}
public static void main(String args[])
{
int x[]={4,1,0,2,5};
System.out.println(findMissingNumber(x,5));
}
}