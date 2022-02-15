class eg2psp
{
public static int _getMaxValueThatCanBeFilled(int[] weights,int[] values,int size,int capacity,int index)
{
int value1=0,value2;
int maximumValue;
if(index>=size || capacity<=0) return 0;
if(weights[index]<=capacity) value1=values[index]+_getMaxValueThatCanBeFilled(weights,values,size,capacity-weights[index],index+1);
value2=_getMaxValueThatCanBeFilled(weights,values,size,capacity,index+1);
maximumValue=(value1>value2)?value1:value2;
return maximumValue;
}
public static int getMaxValueThatCanBeFilled(int[] weights,int[] values,int size,int capacity)
{
return _getMaxValueThatCanBeFilled(weights,values,size,capacity,0);
}
public static void main(String args[])
{
int weights[]={10,20,30};
int values[]={60,100,120};
int size=3;
int capacity=50;
System.out.println("Max value that can be taken away of knapsack of weight 50 is: "+getMaxValueThatCanBeFilled(weights,values,size,capacity));
}
}