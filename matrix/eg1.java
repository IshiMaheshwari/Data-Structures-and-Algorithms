class eg1psp
{
public static void main(String args[])
{
int A[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
int B[][]={{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160}};
int C[][]=new int[4][4];
int num;
for(int e=0;e<=3;e++)
{
for(int f=0;f<=3;f++)
{
num=0;
for(int g=0;g<=3;g++)
{
num=num+A[e][g]*B[g][f];
}
C[e][f]=num;
}
}
System.out.printf("     ");
for(int e=0;e<=3;e++) System.out.printf("%5d",e);
System.out.println();
for(int e=0;e<=3;e++)
{
System.out.printf("%5d",e);
for(int f=0;f<=3;f++)
{
System.out.printf("%5d",C[e][f]);
}
System.out.println();
}
}
}