class StarPyramid
{
public static void main(String args[])
{
int spaces=3;
int stars=1;
while(stars<=7)
{
for(int i=0;i<spaces;i++) System.out.print(" ");
for(int i=0;i<stars;i++) System.out.print("*");
System.out.println();
spaces=spaces-1;
stars=stars+2;
}
}
}