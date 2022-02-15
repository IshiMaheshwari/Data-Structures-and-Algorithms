// Dynamic Programming of LCS
class eg8psp
{
public static int LCS(int[] x,int[] y,int e,int f)
{
if(e==0 || f==0) return 0;
if(x[e-1]==y[f-1]) return 1+LCS(x,y,e-1,f-1);
return (LCS(x,y,e-1,f)>LCS(x,y,e,f-1)?LCS(x,y,e-1,f):LCS(x,y,e,f-1));
}
public static void main(String args[])
{
int x[]={10,20,30,40,50,60};
int y[]={20,40,60,72};
System.out.println("Longest common subsequence : "+LCS(x,y,6,4));
}
}