// KnapSack Problem 0/1 Bounded : Recursive
class eg1psp
{
public static int _getFillValue(int[] w,int[] v,int size,int capacity,int index)
{
int x=0,y;
if(index>=size || capacity<=0) return 0;
if(w[index]<=capacity) x=v[index]+_getFillValue(w,v,size,capacity-w[index],index+1);
y=_getFillValue(w,v,size,capacity,index+1);
return (x>y)?x:y;
}
public static int getKnapsackFillValue(int[] w,int[] v,int size,int capacity)
{
return _getFillValue(w,v,size,capacity,0);
}
public static void main(String args[])
{
int w[]={10,20,30};
int v[]={60,100,120};
int W=50; // W=capacityOfKnapsack
int size=3;
System.out.println(getKnapsackFillValue(w,v,size,W));
}
}