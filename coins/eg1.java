// Recursive solution to find minimum number of coins required
public class eg1
{
public static int voc[]={2,3,6,7};
public static int vocCount=4;
public static int copies=0;
public static int getMinCoins(int value)
{
int k,noc,e;
if(value==0) return 0;
copies++;
noc=Integer.MAX_VALUE-1;
for(e=0;e<vocCount;e++)
{
if(voc[e]<=value)
{
k=getMinCoins(value-voc[e]);
if(k+1<noc) noc=k+1;
}
}
return noc;
}	
public static void main(String args[])
{
System.out.println(getMinCoins(27));
System.out.println("Number of copies generated : "+copies);
}
}