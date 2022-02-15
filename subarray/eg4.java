// Subarray: O(n)
class eg4psp
{
public static void main(String args[])
{
int x[]={1,2,3,5,5,6,8,4};
int size=x.length;
int total=11;
int sum=x[0];
int sf=0;
for(int i=1;i<size;i++)
{
if(total==sum) System.out.println("The sum "+sum+" is present between indexes "+sf+" and "+(i-1));
sum=sum+x[i];
if(sum>total)
{
sum=sum-x[sf];
sf++;
}
}
}
}