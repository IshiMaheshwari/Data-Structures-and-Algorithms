// Find the length of pallindromic string
class eg2psp
{
public static boolean isPallindrome(String str)
{
int i=0;
int j=str.length()-1;
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
System.out.println("Pallindrome : "+isPallindrome("malayalam"));
System.out.println("Pallindrome : "+isPallindrome("abbc"));
}
}