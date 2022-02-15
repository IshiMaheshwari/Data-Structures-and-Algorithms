// Count ways to reach the nth stair
class eg1psp
{
public static int getNumberOfWaysToReachNthStairs(int stairs)
{
int e=1,f=2,k=3,g=0;
if(stairs<=2) return stairs;
while(k<=stairs)
{
g=e+f;
e=f;
f=g;
k++;
}
return g;
}
public static void main(String args[])
{
for(int i=0;i<=10;i++) System.out.println(getNumberOfWaysToReachNthStairs(i));
}
}