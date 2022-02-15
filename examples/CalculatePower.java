import java.util.*;
public class CalculatePower
{
public static int powerCalculation(int num,int power)
{
if(power==0) return 1;
else return num*powerCalculation(num,power-1);
}
public static int calculatePower(int num,int power)
{
return powerCalculation(num,power);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number : ");
int num=sc.nextInt();
System.out.print("Enter the power : ");
int power=sc.nextInt();
System.out.println(calculatePower(num,power));
}
}