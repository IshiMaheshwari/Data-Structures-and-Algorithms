import java.util.*;
class eg3psp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the requirement : ");
int size=sc.nextInt();
int x[]=new int[size];
for(int i=0;i<size;i++)
{
System.out.print("Enter a number : ");
x[i]=sc.nextInt();
}
System.out.print("Enter the kth smallest number to be entered :");
int k=sc.nextInt();
Arrays.sort(x);
System.out.println("The kth smallest number is : "+x[k-1]);
}
}