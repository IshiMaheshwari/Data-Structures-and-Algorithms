// Stock Buy Sell to Maximize Profit: Brute Force
class eg1psp
{
public static int findMaxProfit(int[] x)
{
int size=x.length;
int j=0,max=0;
for(int e=0;e<size-1;e++)
{
for(int f=1;f<size;f++)
{
j=x[f]-x[e];
if(j>max) max=j;
}
}
return max;
}
public static void main(String args[])
{
int x[]={5,30,3,20,72,2,70,62,61,50};
System.out.println(findMaxProfit(x));
int y[]={5,50,50,50,50,50,50,50,50,50};
System.out.println(findMaxProfit(y));
}
}