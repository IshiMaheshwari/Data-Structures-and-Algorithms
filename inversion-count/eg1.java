class eg1psp
{
public static void main(String args[])
{
int x[]={10,9,8,7,6,5,4,3,2,1};
int count=0;
for(int e=0;e<=8;e++)
{
for(int f=e+1;f<=9;f++)
{
if(x[f]<x[e]) count++;
}
}
System.out.println("Number of inversions : "+count);
}
}