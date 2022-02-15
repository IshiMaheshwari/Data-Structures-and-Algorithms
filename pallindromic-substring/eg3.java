// Getting all possible substrings(not combinations)
class eg3psp
{
public static void main(String args[])
{
String s="abcdef";
int len=s.length();
for(int e=0;e<len;e++)
{
for(int f=e;f<len;f++)
{
for(int g=e;g<=f;g++)
{
System.out.print(s.charAt(g));
}
System.out.println();
}
}
}
}