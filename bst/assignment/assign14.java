import java.util.*;
class eg14psp
{
static class Node
{
int data;
Node left;
Node right;
Node(int data)
{
this.data=data;
this.left=null;
this.right=null;
}
}
public static Node root=null;
static void insert(int data)
{
Node j;
Node t=new Node(data);
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
public static void inOrder(Node t)
{
if(t==null) return;
inOrder(t.left);
System.out.println(t.data);
inOrder(t.right);
}
public static boolean isBalanced(Node node)
{
int lh,rh;
if(node==null) return true;
lh=getHeight(node.left);
rh=getHeight(node.right);
if(Math.abs(rh-lh)<=1 && isBalanced(node.left) && isBalanced(node.right)) return true;
return false;
}
public static int getHeight(Node node)
{
if(node==null) return 0;
return 1+Math.max(getHeight(node.left),getHeight(node.right));
}
public static int countNumberOfLeafNodes(Node node)
{
if(node==null) return 0;
if(node.left==null && node.right==null) return 1;
else return (countNumberOfLeafNodes(node.left)+countNumberOfLeafNodes(node.right));
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num,ch;
while(true)
{
System.out.println("1. Insert");
System.out.println("2. To check balancing ");
System.out.println("3. Inorder");
System.out.println("4. Count number of leaf nodes");
System.out.print("Enter your requirement : ");
ch=sc.nextInt();
if(ch==1)
{
System.out.print("Enter a number : ");
num=sc.nextInt();
insert(num);
}
if(ch==2)
{
System.out.println("Is balanced : "+isBalanced(root));
}
if(ch==3)
{
inOrder(root);
}
if(ch==4)
{
System.out.println("Number of leaf nodes : "+countNumberOfLeafNodes(root));
}
}
}
}