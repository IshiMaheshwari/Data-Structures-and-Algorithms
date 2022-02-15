// Determine whether array has duplicates or not
class eg1psp
{
public static boolean isDuplicate(int[] x,int size)
{
for(int e=1;e<size;e++)
{
for(int f=0;f<e;f++)
{
if(x[e]==x[f]) return true;
}
}
return false;
}
public static void main(String args[])
{
int x[]={1,2,3,4,5};
System.out.println(isDuplicate(x,5));
int y[]={1,2,3,4,5,2};
System.out.println(isDuplicate(y,6));
}
}