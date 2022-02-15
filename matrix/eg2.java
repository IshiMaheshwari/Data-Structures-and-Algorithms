class eg2psp
{
public static void main(String args[])
{
int A[][]={{1,2},{3,4}};
int B[][]={{10,20},{30,40}};
int C[][]=new int[2][2];
int D[][]=new int[2][2];
int e,f;
int i,j,k,l,m,n,o,p;
int m1,m2,m3,m4,m5,m6,m7;
i=A[0][0];
j=A[0][1];
k=A[1][0];
l=A[1][1];
m=B[0][0];
n=B[0][1];
o=B[1][0];
p=B[1][1];
m1=i*(n-p);
m2=(i+j)*p;
m3=(k+l)*m;
m4=l*(o-m);
m5=(i+l)*(m+p);
m6=(j-l)*(o+p);
m7=(i-k)*(m+n);
D[0][0]=m5+m4+m6-m2;
D[0][1]=m1+m2;
D[1][0]=m3+m4;
D[1][1]=m1+m5-m3-m7;
System.out.printf("     ");
for(e=0;e<=1;e++) System.out.printf("%5d",e);
System.out.println();
for(e=0;e<=1;e++)
{
System.out.printf("%5d",e);
for(f=0;f<=1;f++)
{
System.out.printf("%5d",D[e][f]);
}
System.out.println();
}
}
}