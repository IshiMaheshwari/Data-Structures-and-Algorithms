// Find the missing number without duplicates
// Exclusive ORing Technique
class eg3psp
{
public static int findMissingNumber(int[] numbers)
{
int v,index;
int n=numbers.length;
for(index=0,v=0;index<n;index++) v=(v^index)^numbers[index];
return (v^index);
}
public static void main(String args[])
{
int numbers[]={10,11,14,15,12};
System.out.println(findMissingNumber(numbers));
}
}