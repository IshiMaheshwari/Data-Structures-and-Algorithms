import java.util.*;
class BST
{
class BSTNode
{
int data;
BSTNode left,right;
BSTNode(int data)
{
this.data=data;
this.left=null;
this.right=null;
}
}
public static BSTNode root=null;
BSTNode createNode(int data)
{
BSTNode t=new BSTNode(data);
return t;
}
void insert(int data)
{
BSTNode t,j;
t=createNode(data);
if(root==null)
{
root=t;
return;
}
j=root;
while(true)
{
if(t.data<j.data)
{
if(j.left==null)
{
j.left=t;
break;
}
else
{
j=j.left;
}
}
else
{
if(j.right==null)
{
j.right=t;
break;
}
else
{
j=j.right;
}
}
}
}
void printLeftNodes(BSTNode t,boolean b)
{
if(t==null) return;
printLeftNodes(t.left,true);
if(b) System.out.println(t.data);
printLeftNodes(t.right,false);
}
void printRightNodes(BSTNode t,boolean b)
{
if(t==null) return;
printRightNodes(t.right,true);
if(b) System.out.println(t.data);
printRightNodes(t.left,false);
}
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
while(true)
{
BST t=new BST();
int num,ch,height,count=0;
System.out.println("1. Enter data");
System.out.println("2. Print Left Nodes");
System.out.println("3. Print Right Nodes");
System.out.println("10. Exit");
System.out.println("11. Print Level ");

System.out.print("Enter your choice :");
ch=sc.nextInt();
if(ch==1)
{
System.out.print("Enter a number : ");
num=sc.nextInt();
t.insert(num);
}
if(ch==2)
{
t.printLeftNodes(root,false); 
}
if(ch==3)
{
t.printRightNodes(root,false); 
}
if(ch==10) break;
}
}
}