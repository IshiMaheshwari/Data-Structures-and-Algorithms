import java.util.*;
class eg3psp
{
public static void _printAllCombinations(char[] str,int start,int end)
{
char g;
int i,k;
if(start==end)
{
for(i=0;i<=end;i++) System.out.print(str[i]);
System.out.println();
return;
}
for(i=start;i<=end;i++)
{
for(k=start;k<i;k++) if(str[i]==str[k]) break;
if(k<i) continue;
g=str[start];
str[start]=str[i];
str[i]=g;
_printAllCombinations(str,start+1,end);
g=str[start];
str[start]=str[i];
str[i]=g;
}
}
public static void printAllCombinations(char[] str)
{
_printAllCombinations(str,0,str.length-1);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string : ");
String s=sc.nextLine();
printAllCombinations(s.toCharArray());
}
}
