import java.util.*;
class CountingSort
{
public static void main(String args[])
{
int x[]={3,43,3,13,12,4,65,6,34,78};
int size=x.length;
int largest=x[0];
for(int i=1;i<size;i++)
{
if(x[i]>largest) largest=x[i];
}
int tmp[]=new int[largest+1];
Arrays.fill(tmp,0);
for(int i=0;i<size;i++)
{
tmp[x[i]]=tmp[x[i]]+1;
}
int i=0;
int y=0;
while(i<=largest)
{
if(tmp[i]>0)
{
x[y]=i;
tmp[i]=tmp[i]-1;
y++;
}
else
{
i++;
}
}
System.out.println(Arrays.toString(x));
}
}