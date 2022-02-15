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
void inOrder(BSTNode root)
{
if(root==null) return;
Stack<BSTNode> s=new Stack<BSTNode>();
BSTNode t=root;
while(t!=null)
{
s.push(t);
t=t.left;
}
while(!s.empty()) 
{
t=s.pop();
if(t.right!=null) s.push(t.right);
if(t.right!=null && t.right.left!=null) s.push(t.right.left);
System.out.println(t.data);
}
}
void preOrder(BSTNode root)
{
if(root==null) return;
Stack<BSTNode> s=new Stack<BSTNode>();
BSTNode t=root;
s.push(t);
while(!s.empty()) 
{
t=s.pop();
System.out.println(t.data);
if(t.right!=null) s.push(t.right);
if(t.left!=null) s.push(t.left);
}
}
void delete(int num)
{
if(root==null) return;

}

void printLeftNodes(BSTNode t,boolean b)
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
BST t=new BST();
int num,ch;
System.out.println("1. Enter data");
System.out.println("2. In Order Traversal");
System.out.println("3. Print Left Nodes");
System.out.println("4. Pre Order Traversal");
System.out.println("5. Delete a node");
System.out.println("10. Exit");
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
t.inOrder(root);
}
if(ch==3)
{
t.printLeftNodes(root,false); 
}
if(ch==4)
{
t.preOrder(root);
}
if(ch==5)
{
System.out.print("Enter the node to be deleted : ");
num=sc.nextInt();
t.delete(num);
}
if(ch==10) break;
}
}
}