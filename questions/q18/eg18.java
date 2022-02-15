// Determine whether an array is mountain array or not
class eg18psp
{
public static void main(String gg[])
{
try
{
int[] x={2,4,5,6,3,1};
int n=x.length;
if(n<3) System.out.println("Minimum 3 elements required");
int left=0;
int right=n-1;
while(left<right && x[left]<x[left+1])
{
left++;
}
while(right>0 && x[right]<x[right-1])
{
right--;
}
if(left>0 && right<n-1 && left==right)
{
System.out.println("It is a mountain array with peak at index "+left);
}
else
{
System.out.println("It is not a mountain array");
}
}catch(Exception e)
{
System.out.println(e);
}
}
}