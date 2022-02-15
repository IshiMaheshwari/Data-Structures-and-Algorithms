import java.util.*;
class BST
{
static class BSTNode
{
BSTNode left,right;
int data;
BSTNode(int data)
{
this.data=data;
this.left=left;
this.right=right;
}
}
public static BSTNode root;

public static void insert(int data)
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

public static void inOrder(BSTNode t)
{
if(t==null) return;
inOrder(t.left);
System.out.println(t.data);
inOrder(t.right);
}

public static void preOrder(BSTNode t)
{
if(t==null) return;
System.out.println(t.data);
preOrder(t.left);
preOrder(t.right);
}

public static void postOrder(BSTNode t)
{
if(t==null) return;
postOrder(t.left);
postOrder(t.right);
System.out.println(t.data);
}

public static void printLeftNodes(BSTNode t,boolean b)
{
if(t==null) return;
printLeftNodes(t.left,true);
if(b) System.out.println(t.data);
printLeftNodes(t.right,false);
}

public static void printRightNodes(BSTNode t,boolean b)
{
if(t==null) return;
printRightNodes(t.right,true);
if(b) System.out.println(t.data);
printRightNodes(t.left,false);
}

public static void inorderUsingStack(BSTNode t)
{
if(root==null) return;
Stack<BSTNode> s=new Stack<BSTNode>();
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

public static void preorderUsingStack(BSTNode t)
{
if(root==null) return;
Stack<BSTNode> s=new Stack<BSTNode>();
s.push(t);
while(!s.empty()) 
{
t=s.pop();
System.out.println(t.data);
if(t.right!=null) s.push(t.right);
if(t.left!=null) s.push(t.left);
}
}

public static void postorderUsingStack(BSTNode t)
{
if(root==null) return;
Stack<BSTNode> s=new Stack<BSTNode>();
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

public static int getHeight(BSTNode t)
{
int lh,rh;
if(t==null) return 0;
lh=getHeight(t.left);
rh=getHeight(t.right);
return (lh>rh)?(lh+1):(rh+1);
}

public static void printLeafNodes(BSTNode t)
{
if(t==null) return;
printLeafNodes(t.left);
if(t.left==null && t.right==null) System.out.println(t.data);
printLeafNodes(t.right);
}

public static void levelOrderTraversal(BSTNode t)
{
if(root==null) return;
Queue<BSTNode> queue=new LinkedList<>();
queue.add(root);
while(queue.size()!=0)
{
t=queue.remove();
System.out.println(t.data);
if(t.left!=null) queue.add(t.left);
if(t.right!=null) queue.add(t.right);
}
}

public static void levelOrderTraversalWithLevelNumber(BSTNode t)
{
int x,j,levelNumber,howManyAddedToQueue;
if(root==null) return;
Queue<BSTNode> queue=new LinkedList<>();
queue.add(root);
howManyAddedToQueue=1;
levelNumber=0;
while(queue.size()!=0)
{
levelNumber++;
x=1;
j=0;
while(x<=howManyAddedToQueue)
{
t=queue.remove();
System.out.println("("+levelNumber+") : "+t.data);
if(t.left!=null)
{
queue.add(t.left);
j++;
}
if(t.right!=null)
{
queue.add(t.right);
j++;
}
x++;
}
howManyAddedToQueue=j;
}
}

public static int getHeightWithoutRecursion(BSTNode t)
{
int x,j,levelNumber,howManyAddedToQueue;
if(root==null) return 0;
Queue<BSTNode> queue=new LinkedList<>();
queue.add(root);
howManyAddedToQueue=1;
levelNumber=0;
while(queue.size()!=0)
{
levelNumber++;
x=1;
j=0;
while(x<=howManyAddedToQueue)
{
t=queue.remove();
if(t.left!=null)
{
queue.add(t.left);
j++;
}
if(t.right!=null)
{
queue.add(t.right);
j++;
}
x++;
}
howManyAddedToQueue=j;
}
return levelNumber;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
insert(100);
insert(50);
insert(25);
insert(75);
insert(65);
insert(85);
insert(200);
insert(150);
insert(275);
insert(260);
insert(285);
while(true)
{
System.out.println("1. Insert");
System.out.println("2. Inorder Traversal");
System.out.println("3. Preorder Traversal");
System.out.println("4. Postorder Traversal");
System.out.println("5. Print Left Nodes");
System.out.println("6. Print Right Nodes");
System.out.println("7. Inorder Traversal Using Stack");
System.out.println("8. Preorder Traversal Using Stack");
System.out.println("9. Postorder Traversal Using Stack");
System.out.println("10. Height of tree");
System.out.println("11. Print Leaf Nodes");
System.out.println("12. Level Order Traversal");
System.out.println("13. Level Order Traversal With Level Number");
System.out.println("14. Get Height without recursion");
System.out.println("25. Exit");
System.out.print("Enter your requirement : ");
int ch=sc.nextInt();
if(ch==2) inOrder(root);
if(ch==3) preOrder(root);
if(ch==4) postOrder(root);
if(ch==5) printLeftNodes(root,false);
if(ch==6) printRightNodes(root,false);
if(ch==7) inorderUsingStack(root);
if(ch==8) preorderUsingStack(root);
if(ch==9) postorderUsingStack(root);
if(ch==10) System.out.println("Height of the tree : "+getHeight(root));
if(ch==11) printLeafNodes(root);
if(ch==12) levelOrderTraversal(root);
if(ch==13) levelOrderTraversalWithLevelNumber(root);
if(ch==14) System.out.println("Height of the tree : "+getHeightWithoutRecursion(root));
if(ch==25) System.exit(0);
}
}
}