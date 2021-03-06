#include<iostream>
#include<utility>
#include<forward_list>
using namespace std;
int main()
{
int x[9]={12,3,92,-3,76,54,12,93,78};
int flags[9]={0,0,0,0,0,0,0,0,0};
int e,f,prev,noel,maxSS;
forward_list<pair<int,int>> list;
maxSS=0;
for(e=0;e<=7;e++)
{
if(flags[e]) continue;
noel=0;
prev=e;
for(f=e+1;f<=8;f++)
{
if(x[f]>x[prev])
{
noel++;
prev=f;
flags[f]=1;
}
}
if(prev>e) 
{
noel++;
if(noel<maxSS) continue;
if(noel>maxSS)
{
maxSS=noel;
list.clear();
}
list.push_front(pair<int,int>(e,prev));
}
}
// we have our indexes(start point,end point) of largest subsequence in list
for(pair<int,int> p:list)
{
cout<<"("<<p.first<<","<<p.second<<")"<<endl;
e=p.first;
prev=e;
for(f=e+1;f<=p.second;f++)
{
if(x[f]>x[prev])
{
cout<<x[prev]<<",";
prev=f;
}
}
cout<<x[prev]<<endl;
}
return 0;
}