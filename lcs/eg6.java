// Finding number of copies generated
class eg6psp
{
public static int copies=0;
public static int getLenOfLCS(int[] x,int[] y,int e,int f)
{
int lenX=x.length;
int lenY=y.length;
int leftSide,rightSide;
copies++;
if(lenX==e || lenY==f) return 0;
if(x[e]==y[f]) return 1+getLenOfLCS(x,y,e+1,f+1);
leftSide=getLenOfLCS(x,y,e+1,f);
rightSide=getLenOfLCS(x,y,e,f+1);
return (leftSide>rightSide)?leftSide:rightSide; 
}
public static int getLengthOfLCS(int[] x,int[] y)
{
return getLenOfLCS(x,y,0,0);
}
public static void main(String args[])
{
int x[]={10,20,30,40,50,60};
int y[]={20,40,60,9};
System.out.println("Length of longest common subsequence : "+getLengthOfLCS(x,y));
System.out.println("Number of copies generated : "+copies);
}
}