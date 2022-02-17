//Kadane's Algorithm for Contiguous Max Sum
class eg1psp
{
public static void main(String args[])
{
int x[]={10,-2,3,7,-5,8,6,-2};
int size=x.length;
int j;
int lmax=x[0];
int gmax=x[0];
for(int i=1;i<size;i++)
{
j=x[i]+lmax;
lmax=(x[i]>j)?x[i]:j;
gmax=(gmax>lmax)?gmax:lmax;
}
System.out.println("Max sum is : "+gmax);
}
}
