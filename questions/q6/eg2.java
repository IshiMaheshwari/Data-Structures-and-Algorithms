// Stock Buy Sell to Maximize Profit: it's not a DP solution
class eg2psp
{
public static int getMaxProfit(int[] x)
{
int min=x[0];
int max=0;
int size=x.length;
int j=0;
for(int i=1;i<size;i++)
{
if(x[i]<min) min=x[i];
else 
{
j=x[i]-min;
if(j>max) max=j;
}
}
return max;
}
public static void main(String args[])
{
int x[]={5,30,2,20,21,22,23,14,15,13};
System.out.println("Maximum Profit : "+getMaxProfit(x));
int y[]={5,50,50,50,50,50,50,50,50,50};
System.out.println("Maximum Profit : "+getMaxProfit(y));
}
}