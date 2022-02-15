// Largest sum Contiguous Subarray -Brute force
class eg1psp
{
public static void main(String args[])
{
int x[]={10,-2,7,-6,-9,3};
int size=x.length;
int z;
int sum=0;
for(int e=0;e<size;e++)
{
z=0;
for(int f=e;f<size;f++)
{
z=z+x[f];
if(z>sum) sum=z;
}
}
System.out.println("Largest sum contiguous subarray : "+sum);
}
}