// Minimum Coin Change : Dynamic Programming
class eg2psp
{
public static void main(String args[])
{
int[] denominations={2,3,5};
int i,j,noc,data;
int value=10;
int denominationsCount=3;
int store[][]=new int[denominationsCount+1][value+1];

for(j=0;j<value+1;j++) store[0][j]=Integer.MAX_VALUE;
for(i=0;i<denominationsCount+1;i++) store[i][0]=0;

for(i=1;i<denominationsCount+1;i++)
{
for(j=1;j<value+1;j++)
{
if(j>=denominations[i-1])
{
data=store[i][j-denominations[i-1]];
if(data==Integer.MAX_VALUE) store[i][j]=store[i-1][j];
else store[i][j]=(data+1<store[i-1][j])?data+1:store[i-1][j];
}
else
{
store[i][j]=store[i-1][j];
}
}
}	
noc=Integer.MAX_VALUE;
for(i=1;i<=denominationsCount;i++) if(store[i][value]<noc) noc=store[i][value];
if(noc!=Integer.MAX_VALUE) System.out.println("Minimum number of coins required : "+noc);
else System.out.println("Not possible");
}
}