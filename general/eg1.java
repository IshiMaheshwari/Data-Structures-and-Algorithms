// Fibonacci Series : first 10 numbers
class eg1psp
{
public static void main(String args[])
{
int x=1;
int y=1;
int z=0;
int j=1;
while(j<=10)
{
System.out.println(x);
z=x+y;
x=y;
y=z;
j++;
}
}
}