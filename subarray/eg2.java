// Find the indexes of subarray as well using Kundane's Algorithm
class eg2psp
{
public static void main(String args[])
{
int x[]={-10,-2,3,7,-5,8,6,-2};
int size=x.length;
int lmax=x[0];
int gmax=x[0];
int j;
int si=0,ei=0;
for(int i=0;i<size;i++)
{
j=lmax+x[i];
if(x[i]>j) 
{
lmax=x[i];
si=i;
}
else
{
lmax=j;
}
if(lmax>gmax)
{
gmax=lmax;
ei=i;
}
}
System.out.println("Max sum is : "+gmax+" with indexes "+si+" to "+ei);
}
}