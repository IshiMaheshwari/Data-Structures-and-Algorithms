// Subarray : O(n^2)
class eg3psp
{
public static void main(String args[])
{
int x[]={2,3,-5,6,6,8,-4,2};
int size=x.length;
int sum,i,j;
int total=10;
for(i=0;i<size;i++)
{
sum=x[i];
for(j=i+1;j<size;j++)
{
sum=sum+x[j];
if(sum==total) System.out.println("There is subarray for total 10 from indexes "+i+" to "+j);
if(sum>total) break;
}
}
}
}