import java.util.*;
class BST
{
static class BSTNode
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
static BSTNode root=null;
static void inOrder(BSTNode root)
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
static void insert(int data)
{
BSTNode t,j;
t=new BSTNode(data);
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

static void mergeBST(BSTNode root1,BSTNode root2)
{

if(root1!=null && root2!=null) insert(root1.data+root2.data);
if(root1.left!=null && root2.left!=null) insert(root1.left.data+root2.left.data);
if(root1.right!=null && root2.right!=null) insert(root1.right.data+root2.right.data);
if(root1.left!=null && root2.left==null) insert(root1.left.data);
if(root1.right!=null && root2.right==null) insert(root1.right.data);
if(root1.left==null && root2.left!=null) insert(root2.left.data);
if(root1.right==null && root2.right!=null) insert(root2.right.data);

}
public static void main(String gg[])
{
BSTNode root1 = new BSTNode(10);
root1.left = new BSTNode(5);
root1.right = new BSTNode(15);
root1.left.right = new BSTNode(7);

BSTNode root2 = new BSTNode(100);
root2.left = new BSTNode(50);
root2.right = new BSTNode(150);
root2.left.right = new BSTNode(60);
root2.right.left = new BSTNode(125);
root2.right.right = new BSTNode(200);
root2.right.left.left = new BSTNode(110);
mergeBST(root1,root2);
inOrder(root);
}
}