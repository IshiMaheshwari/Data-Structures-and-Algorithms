import java.util.*;
class insertion
{
public static void main(String args[])
{
int x[]={100,90,80,70,60,50,40,30,20,10};
int size=x.length;
int lb=0;
int ub=size-1;
int num,z;
for(int y=lb;y<=ub;y++)
{
for(num=x[y],z=y-1;z>=0 && x[z]>=num;z--) x[z+1]=x[z];
x[z+1]=num;
}
System.out.println(Arrays.toString(x));
}
}