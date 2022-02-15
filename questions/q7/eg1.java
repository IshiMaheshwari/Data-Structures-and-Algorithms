// Range sum queries
class eg1psp
{
public static int rangeSum(int[] x,int s,int e)
{
int sum;
for(sum=0;s<=e;s++) sum=sum+x[s];
return sum;
}
public static void main(String args[])
{
int x[]={10,20,30,40,50,60,70,80,90,100};
System.out.println("Range Sum(1-4) : "+rangeSum(x,1,4));
System.out.println("Range Sum(2-7) : "+rangeSum(x,2,7));
System.out.println("Range Sum(6-9) : "+rangeSum(x,6,9));
}
}