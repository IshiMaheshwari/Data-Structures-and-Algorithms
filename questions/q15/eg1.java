import java.util.*;
import java.io.*;
import java.lang.*;
class Interval
{
int start;
int end;
public Interval(int s,int e)
{
this.start=s;
this.end=e;
}
public String toString()
{
return this.start+"-"+this.end;
}
static class myIntervalComparator implements Comparator<Interval>
{
public int compare(Interval left,Interval right)
{
return left.start-right.start;
}
}
public static void main(String args[])
{
ArrayList<Interval> ar=new ArrayList<>();
ar.add(new Interval(20,23));
ar.add(new Interval(21,34));
ar.add(new Interval(5,19));
ar.add(new Interval(19,23));
ar.add(new Interval(6,19));
ar.add(new Interval(34,37));
int numberOfMeetings=ar.size();
System.out.println("Number of meetings : "+numberOfMeetings);
Collections.sort(ar,new myIntervalComparator());
for(int i=0;i<ar.size();i++) System.out.println(ar.get(i));
}
}
