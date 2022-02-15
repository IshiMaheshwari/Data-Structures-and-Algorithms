cimport java.util.*;
class eg1psp
{
static int count=0;
public static void _printAllCombinations(String seed,char[] set,int setSize,int maxLength)
{
int i,seedLength;
if(maxLength==0)
{
count++;
System.out.println(seed);
return;
}
seedLength=seed.length();
String str=new String();
str.setSize(seedLength+2);
str=seed;
String s=String.valueOf(set);
for(i=0;i<setSize;i++)
{
str=s.charAt(i);
_printAllCombinations(str,s.toCharArray(),setSize,maxLength-1);
}
}
public static void printAllCombinations(char[] set,int setSize,int maxLength)
{
_printAllCombinations("",set,setSize,maxLength);
}
public static void main(String args[])
{
char charSet[]={'0','1','2','3','4','5','6','7','8','9'};
printAllCombinations(charSet,10,3);
System.out.println("Total number of combinations : "+count);
}
}