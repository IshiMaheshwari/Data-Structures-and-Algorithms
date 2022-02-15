import java.util.*;
class eg3psp
{
static int  m[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
static int count=0;
public static int pwr(int b,int c)
{
count++;
if(c==1) return b;
if(m[c]!=0) return m[c];
m[c]=(c%2==0)?pwr(b,c/2)*pwr(b,c/2):b*pwr(b,c/2)*pwr(b,c/2);
return m[c];
}
public static int power(int b,int c)
{
if(c==0) return 1;
return pwr(b,c);
}
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter value of b : ");
int b=sc.nextInt();
System.out.print("Enter value of c : ");
int c=sc.nextInt();
System.out.println(power(b,c));
}
}