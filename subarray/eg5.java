// Subarray : Sliding Window
import java.util.*;
class eg5psp
{
public static void main(String args[])
{
int x[]={10,-3,7,6,-2,4,3,9,-5,12};
int j,k;
int sum=5; 
Map<Integer,Integer> subarray=new HashMap<>();
int acc_sum=0;
for(k=0;k<9;k++)
{
acc_sum=acc_sum+x[k];
if(acc_sum==sum)
{
System.out.println("From 0 to "+k+" is your subarray");
break;
}
j=acc_sum-sum;
boolean m=subarray.containsKey(j);
if(m!=subarray.lastEntry)
{
subarray.put(j,k);
}
else
{
System.out.println("From "+subarray.get(j)+" to "+k+" is your subarray");
}
}

}
}