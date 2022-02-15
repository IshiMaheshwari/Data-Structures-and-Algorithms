import java.util.*;
class bubble
{
public static void main(String gg[])
{
int x[]={100,90,80,70,60,50,40,30,20,10};
int size=x.length;
int g;
for(int m=size-2;m>=0;m--)
{
for(int e=0,f=1;e<=m;e++,f++)
{
if(x[f]<x[e])
{
g=x[e];
x[e]=x[f];
x[f]=g;
}
}
}
System.out.println(Arrays.toString(x));
}
}