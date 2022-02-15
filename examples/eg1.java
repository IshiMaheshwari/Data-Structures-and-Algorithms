import java.util.*;
class Power
{
public static int powerOfANumber(int b,int y)
{
if(y==0) return 1;
int power=1;
int i=1;
while(i<=y)
{
power=power*b;
i++;
}
return power;
}
public static void main(String args[])
{
System.out.println(powerOfANumber(4,4));
}
}