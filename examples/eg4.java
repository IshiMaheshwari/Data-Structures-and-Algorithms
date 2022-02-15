class eg4psp
{
public static void main(String args[])
{
int x[]={0,1,2,3,4,5,6,7,8,9};
int count=0;
for(int i=0;i<=9;i++)
{
for(int j=0;j<=9;j++)
{
for(int k=0;k<=9;k++)
{
if(i!=j && j!=k && k!=i)
{
count++;
System.out.println(x[i]+","+x[j]+","+x[k]);
}
}
}
}
System.out.println("Total combinations of all possible 3 digit strings are : "+count);
}
}