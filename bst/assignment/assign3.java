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
static boolean pathSum(BSTNode root,int num)
{
if(root==null) return false;
num=num-root.data;
if(num==0 && root.left==null && root.right==null) return true;
boolean left=pathSum(root.left,num);
boolean right=pathSum(root.right,num);
return left||right;
}
public static void main(String gg[])
{
BSTNode root = new BSTNode(15);
root.left = new BSTNode(10);
root.right = new BSTNode(20);
root.left.left = new BSTNode(5);
root.left.right = new BSTNode(12);
root.right.right = new BSTNode(25);
System.out.println("Path Sum : "+pathSum(root,30));
}
}