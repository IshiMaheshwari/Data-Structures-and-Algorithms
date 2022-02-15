import java.util.*;

class BSTNode
{
int data;
BSTNode left,right;
BSTNode()
{
this.left=null;
this.right=null;
}
}
class BST
{
public static BSTNode root=null;
public static BSTNode createNode(int data)
{
BSTNode t=new BSTNode();
t.data=data;
t.right=null;
t.left=null;
return t;
}
public static void insert(int data)
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
public static void inOrder(BSTNode t)
{
if(t==null) return;
inOrder(t.left);
System.out.println(t.data);
inOrder(t.right);
}
public static void printLeftNodes(BSTNode t,boolean b)
{
if(t==null) return;
printLeftNodes(t.left,true);
if(b) System.out.println(t.data);
printLeftNodes(t.right,false);
}
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
while(true)
{
int num,ch;
System.out.println("1. Enter data");
System.out.println("2. In Order Traversal");
System.out.println("3. Print Left Nodes");
System.out.println("10. Exit");
System.out.print("Enter your choice :");
ch=sc.nextInt();
if(ch==1)
{
System.out.print("Enter a number : ");
num=sc.nextInt();
insert(num);
}
if(ch==2)
{
inOrder(root);
}
if(ch==3)
{
printLeftNodes(root,false); 
}
if(ch==10) break;
}
}
}