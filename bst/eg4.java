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
void postOrder(BSTNode root)
{
if(root==null) return;
Stack<BSTNode> s=new Stack<BSTNode>();
BSTNode t=root;
try
{
while(true)
{
while(t!=null)
{
if(t.right!=null) s.push(t.right);
s.push(t);
t=t.left;
}
if(s.size()!=0) t=s.pop();
if(s.size()>=1 && s.peek()==t.right)
{
if(s.size()!=0) s.pop();
s.push(t);
t=t.right;
}
else
{
System.out.println(t.data);
t=null;
}
if(s.empty()) break;
}
}catch(EmptyStackException e)
{
System.out.println(e);
}
}
void printLeftNodes(BSTNode t,boolean b)
{
if(t==null) return;
printLeftNodes(t.left,true);
if(b) System.out.println(t.data);
printLeftNodes(t.right,false);
}
int countNoOfLeafNodes(BSTNode root)
{
if(root==null) return 0;
if(root.left==null && root.right==null) return 1;
else return countNoOfLeafNodes(root.left)+countNoOfLeafNodes(root.right);
}
int getHeight(BSTNode root)
{
if(root==null) return 0;
return max(getHeight(root.left),getHeight(root.right))+1;
}
int max(int a,int b)
{
if(a>b) return a;
else return b;
}
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
while(true)
{
BST t=new BST();
int num,ch,height,count=0;
System.out.println("1. Enter data");
System.out.println("2. In Order Traversal");
System.out.println("3. Print Left Nodes");
System.out.println("4. Pre Order Traversal");
System.out.println("5. Delete a node");
System.out.println("6. Count number of leaf nodes");
System.out.println("7. Height of the tree");
System.out.println("8. Post Order Traversal");
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
}
if(ch==6)
{
count=t.countNoOfLeafNodes(root);
System.out.println("Number of leaf nodes are : "+count);
}
if(ch==7)
{
height=t.getHeight(root);
System.out.println("Height of the tree is : "+height);
}
if(ch==8)
{
t.postOrder(root);
}
if(ch==10) break;
}
}
}