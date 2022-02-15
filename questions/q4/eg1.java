/*Find the element that appears once in an array whereas every other 
element appears twice */
// Exclusive Oring Technique
class eg1psp
{
public static int getSingleNumberFromCollection(int[] x)
{
int size=x.length;
int e=0;
for(int i=0;i<size;i++) e=e^x[i];
return e;
}
public static void main(String args[])
{
int x[]={2,3,2,4,4,3,7,8,9,9,8};
System.out.println(getSingleNumberFromCollection(x));
}
}