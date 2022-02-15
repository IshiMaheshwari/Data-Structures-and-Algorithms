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
static boolean isIdentical(BSTNode root1,BSTNode root2)
{
if(root1==null && root2==null) return true;
if((root1!=null && root2==null)||(root1==null && root2!=null)) return false;
if(root1.data==root2.data && isIdentical(root1.left,root2.left)==true && isIdentical(root1.right,root2.right)==true) return true;
else return false;
}
public static void main(String gg[])
{
BSTNode root1 = new BSTNode(15);
root1.left = new BSTNode(10);
root1.right = new BSTNode(20);
root1.left.left = new BSTNode(5);
root1.left.right = new BSTNode(12);
root1.right.right = new BSTNode(25);
BSTNode root2 = new BSTNode(15);
root2.left = new BSTNode(10);
root2.right = new BSTNode(20);
root2.left.left = new BSTNode(5);
root2.left.right = new BSTNode(12);
root2.right.right = new BSTNode(25);
System.out.println("Is Identical : "+isIdentical(root1,root2));
}
}