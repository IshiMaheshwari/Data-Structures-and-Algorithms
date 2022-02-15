// Getting the nth fibonacci number
import java.util.*;
class eg2psp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the nth fibonacci number : ");
int n=sc.nextInt();
int x=0;
int y=1;
int z=0;
int j=1;
while(j<n)
{
z=x+y;
x=y;
y=z;
j++;
}
System.out.println("The required number is : "+y);
}
}
