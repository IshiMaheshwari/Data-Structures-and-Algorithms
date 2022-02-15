// Find missing numbers with duplicates
class eg1psp
{
public static void findMissingNumbers(int[] x)
{
int size=x.length;
for(int i=0;i<size;i++)
{
if(x[i]>0)
{
if(x[x[i]-1]>0) x[x[i]-1]=(-1)*x[x[i]-1];
}
}
}
public static void main(String args[])
{
int x[]={2,3,3,3,4,2,3,3,3};
int n=6;
findMissingNumbers(x);
for(int i=0;i<n;i++)
{
if(x[i]>0) System.out.println(i+1);
}
}
}