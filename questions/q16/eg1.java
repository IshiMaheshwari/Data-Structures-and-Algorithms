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
public static boolean canAttendAll(ArrayList<Interval> arr,int size)
{
if(size==0) return false;
for(int i=1;i<size;i++) if(arr.get(i).start<arr.get(i-1).end) return false;
return true;
}
public static void main(String args[])
{
ArrayList<Interval> ar=new ArrayList<>();
ar.add(new Interval(0,5));
ar.add(new Interval(6,12));
ar.add(new Interval(12,20));
int numberOfMeetings=ar.size();
System.out.println("Number of meetings : "+numberOfMeetings);
Collections.sort(ar,new myIntervalComparator());
for(int i=0;i<ar.size();i++) System.out.println(ar.get(i));
System.out.println(canAttendAll(ar,numberOfMeetings)?"Yes":"No");
}
}
