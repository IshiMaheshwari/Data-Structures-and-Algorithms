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

static BSTNode LCA(BSTNode root,int a,int b)
{
if(root==null) return null;
if(root.data>a && root.data>b) return LCA(root.left,a,b);
if(root.data<a && root.data<b) return LCA(root.right,a,b);
return root;
}
public static void main(String gg[])
{
BSTNode root = new BSTNode(20);
root.left = new BSTNode(8);
root.right = new BSTNode(22);
root.left.left = new BSTNode(4);
root.left.right = new BSTNode(12);
root.left.right.left = new BSTNode(10);
root.left.right.right = new BSTNode(14);
BSTNode j=LCA(root,14,8);
System.out.println("Lowest Common Ancestor : "+j.data);
BSTNode k=LCA(root,10,22);
System.out.println("Lowest Common Ancestor : "+k.data);

}
}