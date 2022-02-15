// Range Sum Queries
class eg2psp
{
public static int t[]=new int[10];
public static void doPreProcessing(int[] x)
{
int size=x.length;
t[0]=x[0];
for(int e=1;e<size;e++) t[e]=t[e-1]+x[e];
}
public static int rangeSum(int[] x,int s,int e)
{
if(s==0) return t[e];
return t[e]-t[s-1];
}
public static void main(String args[])
{
int x[]={10,20,30,40,50,60,70,80,90,100};
doPreProcessing(x);
System.out.println("Range Sum(1-4) : "+rangeSum(x,1,4));
System.out.println("Range Sum(2-7) : "+rangeSum(x,2,7));
System.out.println("Range Sum(6-9) : "+rangeSum(x,6,9));
}
}