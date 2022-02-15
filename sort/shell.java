import java.util.*;
class ShellSort
{
public static void main(String args[])
{
int x[]={100,90,80,70,60,50,40,30,20,10};
int lb=0,ub=9;
int num,z;
int size=x.length;
int diff=size/2;
while(diff>=1)
{
for(int y=lb;y<=ub;y=y+diff)
{
for(num=x[y],z=y-diff;z>=0 && x[z]>=num;z=z-diff) x[z+diff]=x[z];
x[z+diff]=num;
}
diff=diff/2;
}
System.out.println(Arrays.toString(x));
}
}