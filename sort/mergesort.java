import java.util.*;
class MergeSort
{
public static void merge(int []x,int lb,int mid,int ub)
{
int i1,i2,i3,lb1,lb2,lb3,ub1,ub2,ub3;
int tmpSize=(ub-lb)+1;
int tmp[]=new int[tmpSize];
lb1=lb;
ub1=mid;
lb2=mid+1;
ub2=ub;
lb3=0;
ub3=tmpSize-1;
i1=lb1;
i2=lb2;
i3=lb3;

while(i1<=ub1 && i2<=ub2)
{
if(x[i1]<x[i2])
{
tmp[i3]=x[i1];
i1++;
}
else
{
tmp[i3]=x[i2];
i2++;
}
i3++;
}

while(i1<=ub1)
{
tmp[i3]=x[i1];
i1++;
i3++;
}

while(i2<=ub2)
{
tmp[i3]=x[i2];
i2++;
i3++;
}

// Copying back to original array
i1=lb1;
i3=lb3;
while(i1<=ub2)
{
x[i1]=tmp[i3];
i3++;
i1++;
}

}
public static void mergeSort(int []x,int low,int high)
{
int mid;
if(low<high)
{
mid=(low+high)/2;
mergeSort(x,low,mid);
mergeSort(x,mid+1,high);
merge(x,low,mid,high);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x[]=new int[10];
for(int i=0;i<=9;i++)
{
System.out.print("Enter a number : ");
x[i]=sc.nextInt();
}
mergeSort(x,0,9);
System.out.println(Arrays.toString(x));
}
}