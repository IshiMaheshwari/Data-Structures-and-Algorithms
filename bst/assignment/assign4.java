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
static int height(BSTNode root)
{
if(root==null) return 0;
return (1+Math.max(height(root.left),height(root.right)));
}
static int findDiameter(BSTNode root)
{
if(root==null) return 0;
int leftHeight=height(root.left);
int rightHeight=height(root.right);
int leftDiameter=findDiameter(root.left);
int rightDiameter=findDiameter(root.right);
return Math.max(leftHeight+rightHeight+1,Math.max(leftDiameter,rightDiameter));
}
public static void main(String gg[])
{
BSTNode root = new BSTNode(110);
root.left = new BSTNode(55);
root.right = new BSTNode(165);
root.left.right = new BSTNode(67);
root.right.left = new BSTNode(125);
System.out.println("Diameter : "+findDiameter(root));
}
}