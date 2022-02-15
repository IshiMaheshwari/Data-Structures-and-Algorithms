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
public static int getNumberOfMinimumRoomsRequired(ArrayList<Interval> arr,int size)
{
PriorityQueue<Integer> queue=new PriorityQueue<>();
if(size==0) return 0;
int count=1;
int top;
queue.add(arr.get(0).end);
for(int i=1;i<size;i++)
{
top=queue.poll();
if((arr.get(i).start)<top) count++;
else queue.remove(top);
queue.add(arr.get(i).end);
}
return count;
}
public static void main(String args[])
{
ArrayList<Interval> ar=new ArrayList<>();
ar.add(new Interval(0,5));
ar.add(new Interval(1,2));
ar.add(new Interval(1,10));
int numberOfMeetings=ar.size();
System.out.println("Number of meetings : "+numberOfMeetings);
Collections.sort(ar,new myIntervalComparator());
for(int i=0;i<ar.size();i++) System.out.println(ar.get(i));
System.out.println("Minimum rooms required to conduct all meetings : "+getNumberOfMinimumRoomsRequired(ar,numberOfMeetings));
}
}
