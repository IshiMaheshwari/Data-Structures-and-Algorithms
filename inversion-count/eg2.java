class eg2psp
{
public static int merge(int[] x,int lb,int mid,int ub,int[] tmp)
{
int count=0;
int i1,i2,i3;
i1=lb;
i2=mid+1;
i3=lb;
while(i1<=mid && i2<=ub)
{
if(x[i1]<x[i2])
{
tmp[i3]=x[i1];
i1++;
}
else
{
tmp[i3]=x[i2];
count=count+(mid-i1)+1;
i2++;
}
i3++;
}
while(i1<=mid)
{
tmp[i3]=x[i1];
i1++;
i3++;
}
while(i2<=ub)
{
tmp[i3]=x[i2];
i2++;
i3++;
}
i3=lb;
while(i3<=ub)
{
tmp[i3]=x[i3];
i3++;
}
return count;
}
public static int mergeSort(int[] x,int lb,int ub,int[] tmp)
{
int count=0;
int mid;
if(lb<ub)
{
mid=(lb+ub)/2;
count=count+mergeSort(x,lb,mid,tmp);
count=count+mergeSort(x,mid+1,ub,tmp);
count=count+merge(x,lb,mid,ub,tmp);
}
return count;
}
public static int invCount(int[] x,int size)
{
int[] tmp=new int[size];
int count=mergeSort(x,0,size-1,tmp);
return count;
}
public static void main(String args[])
{
int x[]={1000,900,800,700,600,500,400,300,200,100};
System.out.println("Inversion Count : "+invCount(x,10));
}
}