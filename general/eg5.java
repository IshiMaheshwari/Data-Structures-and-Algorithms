/* Accept numbers in an array and print all ascending order sequence;
not necessarily in continous form. */
import java.util.*;
class eg5psp
{
public static void main(String args[])
{
int x[]={12,3,92,-3,76,54,12,93,78};
int[] flags=new int[9];
Arrays.fill(flags,0);
int e,f,prev,noel;
System.out.printf("The sequence is : ");
for(e=0;e<=8;e++) System.out.printf("%3d",x[e]);
System.out.println();
System.out.printf("The indexes are : ");
for(e=0;e<=8;e++) System.out.printf("%3d",e);
System.out.println();
// Logic 
for(e=0;e<=7;e++)
{
if(flags[e]!=0) continue;
noel=0;
prev=e;
for(f=e+1;f<=8;f++)
{
if(x[f]>x[prev])
{
System.out.printf("%d,",x[prev]);
noel++;
prev=f;
flags[f]=1;
}
}
if(prev>e)
{
System.out.println(x[prev]);
noel++;
System.out.println("The above "+noel+" elements are from index "+e+" to "+prev);
}
}
}
}
