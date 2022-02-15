import java.util.*;
class PigeonHoleSort
{
public static void main(String gg[])
{
int x[]={32,5,15,56,982,78,23,301,54,95};
int size=x.length;
int max=x[0];
int min=x[0];
int i;
for(i=0;i<size;i++)
{
if(x[i]>max) max=x[i];
if(x[i]<min) min=x[i];
}
int range=max-min+1;
Stack<Integer> s=new Stack<Integer>();
s.setSize(range);
for(i=0;i<size;i++)
{
int y=x[i]-min;
s.insertElementAt(x[i],y);
}
while(s.remove(null))
{
}
System.out.println(s);
}
}