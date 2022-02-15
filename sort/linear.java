import java.util.*;
class linear
{
public static void main(String gg[])
{
int x[]={100,90,80,70,60,50,40,30,20,10};
int size=x.length;
int g;
for(int i=0;i<=size-2;i++)
{
for(int j=i+1;j<=size-1;j++)
{
if(x[j]<x[i])
{
g=x[i];
x[i]=x[j];
x[j]=g;
}
}
}
System.out.println(Arrays.toString(x));
}
}