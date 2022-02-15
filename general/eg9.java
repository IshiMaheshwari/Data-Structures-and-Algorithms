// Dynamic Programming Solution of length of LIS
import java.util.*;
class eg9psp
{
public static void main(String args[])
{
int x[]={12,3,92,-3,76,54,12,93,78};
int size=x.length;
int m[]=new int[size];
Arrays.fill(m,1);
int max=0;
for(int f=1;f<size;f++)
{
for(int e=0;e<f;e++)
{
if(x[e]<x[f] && m[f]<m[e]+1) m[f]=m[e]+1;
}
}
for(int i=0;i<size;i++)
{
if(m[i]>max) max=m[i];
}
System.out.println("Length of LIS : "+max);
// Just for seeing
for(int i=0;i<size;i++)
{
System.out.println(m[i]);
}
}
}