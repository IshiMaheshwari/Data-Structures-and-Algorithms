class eg4psp
{
public static void print(String str,int e,int f)
{
int sp=e;
int ep=str.length()+f;
while(sp<ep)
{
System.out.print(str.charAt(sp));
sp++;
}
System.out.println();
}
public static boolean isPallindrome(String str,int e,int f)
{
int i=e;
int j=(str.length()-1)+f;
int length=0;
while(i<j)
{
if(str.charAt(i)!=str.charAt(j)) return false;
i++;
j--;
}
length=str.length();
System.out.print("Length : "+length+" ,");
return true;
}
public static void main(String args[])
{
String s="malayalam";
int len=s.length();
for(int e=0;e<len;e++)
{
for(int f=e;f<len;f++)
{
if(isPallindrome(s,e,f)==true)
{
print(s,e,f);
}
}
}
}
}