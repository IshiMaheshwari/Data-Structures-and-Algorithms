import java.util.*;
class eg1psp
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number : ");
int x=sc.nextInt();
System.out.print("Enter another number : ");
int y=sc.nextInt();
int hcf=1;
for(int i=1;i<=x && i<=y;i++)
{
if(x%i==0 && y%i==0) hcf=i;
}
System.out.println("HCF of two numbers is : "+hcf);
}
}