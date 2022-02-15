// Kadane's Algorithm for largest sum contiguous array
class eg2psp
{
public static void main(String args[])
{
int x[]={-2,-3,4,-1,-2,1,5,-3};
int size=x.length;
int localMax=x[0];
int globalMax=x[0];
for(int i=0;i<size;i++)
{
if(x[i]>x[i]+localMax) localMax=x[i];
else localMax=x[i]+localMax;
if(localMax>globalMax) globalMax=localMax;
else globalMax=globalMax;
}
System.out.println("Max Sum is : "+globalMax);
}
}