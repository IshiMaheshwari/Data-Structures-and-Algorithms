#include<stdio.h>
#include<string.h>
struct data
{
int length;
int palindrome;
};
void print(char *str,int e,int f)
{
char *sp,*ep;
sp=str+e;
ep=str+f;
while(sp<=ep)
{
printf("%c",*sp);
sp++;
}
printf("\n");
}
struct data isPalindrome(char *str,int e,int f)
{
struct data ds;
char *start,*end,*sp,*ep;
sp=str+e;
ep=str+f;
for(end=sp;end<ep;end++);
ds.length=f-e+1;
for(start=sp;start<end && *start==*end;start++,end--);
ds.palindrome=(!(start<end));
return ds;
}
int main()
{
char a[7]="abba";
int e,f,g,len;
struct data ds;
len=strlen(a);
for(e=0;e<len;e++)
{
for(f=e;f<len;f++)
{
// determine if the portion from (e to f) is pallindrome or not
ds=isPalindrome(a,e,f);
if(ds.palindrome)
{
print(a,e,f);
printf("Length %d, Palindrome %d\n",ds.length,ds.palindrome);
}
}
}
return 0;
}