// Check whether string is pallindrome or not
class eg1psp
{
public static boolean isPallindrome(String str)
{
int i=0;
int j=str.length()-1;
while(i<j)
{
if(str.charAt(i)!=str.charAt(j)) return false;
i++;
j--;
}
return true;
}
public static void main(String args[])
{
System.out.println("Pallindrome : "+isPallindrome("malayalam"));
System.out.println("Pallindrome : "+isPallindrome("abbc"));
}
}