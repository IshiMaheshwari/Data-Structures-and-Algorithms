// Find the smallest letter greater than target in sorted
// array of letters
class eg20psp
{
static char smallestGreaterThanTarget(char x[],char target)
{
for(char i:x)
{
if(i>target) return i;
}
return x[0];
}
public static void main(String gg[])
{
char x[]={'b','g','h','m'};
char target='y';
System.out.println(smallestGreaterThanTarget(x,target));
}
}