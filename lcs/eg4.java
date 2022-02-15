// Length of Max_SS 
import java.util.*;
class eg4psp
{
public static void main(String args[])
{
int x[]={65,66,67,68,80,90};
int tmp1[]=new int[6];
int tmp1i;
int lenX=6;
int xEP,e,j,num1,upperBoundX;
int maxSS;

int y[]={66,90,68,80};
int tmp2[]=new int[4];
int tmp2i;
int lenY=4;
int yEP,num2,upperBoundY;

upperBoundX=lenX-1;
xEP=(int)(Math.pow(2,lenX)-1);

upperBoundY=lenY-1;
yEP=(int)(Math.pow(2,lenY)-1);

maxSS=0;
num1=1;
while(num1<=xEP)
{
tmp1i=0;
for(e=upperBoundX;e>=0;e--)
{
j=num1>>e;
if((j&1)==1)
{
tmp1[tmp1i]=x[upperBoundX-e];
tmp1i++;
}
}

//for testing
//for(e=0;e<tmp1i;e++) printf("%c ",tmp1[e]);
//printf("\n");
// one sub sequence of x array is in tmp1 array
// logic to search the tmp1 in all possible subsequences of y array starts here

num2=1;
while(num2<=yEP)
{
tmp2i=0;
for(e=upperBoundY;e>=0;e--)
{
j=num2>>e;
if((j&1)==1)
{
tmp2[tmp2i]=y[upperBoundY-e];
tmp2i++;
}
}

// a subsequence of y array is ready in tmp2,
// we need to compare it tmp1
if(tmp1i==tmp2i && tmp1i>maxSS) // if length is same,and it is greater than maxSS then only we are interested
{
for(e=0;e<tmp1i;e++)
{
if(tmp1[e]!=tmp2[e]) break;
}
if(e==tmp1i)
{
maxSS=tmp1i;
break;
}
}
num2++;
}
// logic to search the tmp1 in all possible sub sequences of y array ends here
num1++;
}
System.out.println("Length of lcs : "+maxSS); 
}
}