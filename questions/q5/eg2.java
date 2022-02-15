class eg2psp
{
public static int getNumberOfWaysToClimbStairs(int stairs)
{
int e=1,f=1,g=1;
while(g<=stairs)
{
f=f+e;
e=f-e;
g++;
}
return e;
}
public static void main(String args[])
{
System.out.println("Number of ways to climb 7 stairs are : "+getNumberOfWaysToClimbStairs(7));
}
}