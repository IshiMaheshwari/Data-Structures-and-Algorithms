// Length of Longest Increasing Subsequence
import java.util.*;
class eg8psp
{
public static void main(String args[])
{
int x[]={3,4,5,6,7,18,9,10,11};
int[] flags=new int[9];
Arrays.fill(flags,0);
int e,f,prev,noel,maxSS;
maxSS=0;
for(e=0;e<=7;e++)
{
if(flags[e]!=0) continue;
noel=0;
prev=e;
for(f=e+1;f<=7;f++)
{
if(x[f]>x[prev])
{
noel++;
prev=f;
flags[f]=1;
}
}
if(prev>e)
{
noel++;
if(noel<maxSS) continue;
if(noel>maxSS) maxSS=noel;
}
}
System.out.println("Length of LIS is "+maxSS);
}
}