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
static int getHeight(BSTNode root)
{
if(root==null) return 0;
return max(getHeight(root.left),getHeight(root.right))+1;
}
static int max(int a,int b)
{
if(a>b) return a;
else return b;
}
static void levelOrder(BSTNode root)
{
}
public static void main(String gg[])
{
BSTNode root1 = new BSTNode(100);
root1.left = new BSTNode(50);
root1.right = new BSTNode(200);
root1.left.left = new BSTNode(25);
root1.left.right = new BSTNode(75);
root1.right.left = new BSTNode(150);
root1.right.right = new BSTNode(300);
levelOrder(root1);
}
}