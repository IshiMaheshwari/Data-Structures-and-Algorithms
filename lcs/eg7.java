// Finding number of copies generated and so taken 2-D array & if aldready 
// computed no need to recompute 
class eg7psp
{
public static int copies=0;
public static int[][] store=new int[6][4];
public static int getLenOfLCS(int[] x,int[] y,int e,int f)
{
int lenX=x.length;
int lenY=y.length;
int leftSide,rightSide;
copies++;
if(lenX==e || lenY==f) return 0;
if(store[e][f]!=-1) return store[e][f];
if(x[e]==y[f]) return  store[e][f]=1+getLenOfLCS(x,y,e+1,f+1);
leftSide=getLenOfLCS(x,y,e+1,f);
rightSide=getLenOfLCS(x,y,e,f+1);
return store[e][f]=(leftSide>rightSide)?leftSide:rightSide; 
}
public static int getLengthOfLCS(int[] x,int[] y)
{
int e,f;
for(e=0;e<=5;e++)
{
for(f=0;f<=3;f++) store[e][f]=-1;
}
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