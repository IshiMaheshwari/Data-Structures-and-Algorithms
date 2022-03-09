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
public static BSTNode root1;
public static BSTNode root2;

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

public static void printLeftBSTNodes(BSTNode t,boolean b)
{
if(t==null) return;
printLeftBSTNodes(t.left,true);
if(b) System.out.println(t.data);
printLeftBSTNodes(t.right,false);
}

public static void printRightBSTNodes(BSTNode t,boolean b)
{
if(t==null) return;
printRightBSTNodes(t.right,true);
if(b) System.out.println(t.data);
printRightBSTNodes(t.left,false);
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

public static void printLeafBSTNodes(BSTNode t)
{
if(t==null) return;
printLeafBSTNodes(t.left);
if(t.left==null && t.right==null) System.out.println(t.data);
printLeafBSTNodes(t.right);
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

public static void findMinPathFromRootToLeafBSTNode(BSTNode root)
{
Queue<BSTNode> queue=new LinkedList<>();
queue.add(root);
int leafData=-1;
BSTNode temp=null;
HashMap<Integer,Integer> parent=new HashMap<>();
parent.put(root.data,root.data);
while(!queue.isEmpty())
{
temp=queue.poll();
if(temp.left==null && temp.right==null)
{
leafData=temp.data;
break;
}
else
{
if(temp.left!=null)
{
queue.add(temp.left);
parent.put(temp.left.data,temp.data);
}
if(temp.right!=null)
{
queue.add(temp.right);
parent.put(temp.right.data,temp.data);
}
}
}
printPath(leafData,parent);
System.out.println(leafData);
}
public static void printPath(int data,HashMap<Integer,Integer> parent)
{
if(parent.get(data)==data) return;
printPath(parent.get(data),parent);
System.out.print(parent.get(data)+" ");
}

public static boolean compareTrees(BSTNode root1,BSTNode root2)
{
if(root1==root2) return true;
if(root1==null || root2==null) return false;
if(root1.data!=root2.data) return false;
if(!compareTrees(root1.left,root2.left)) return false;
if(!compareTrees(root1.right,root2.right)) return false;
return true;
}

public static boolean compareTreesWithoutRecursion(BSTNode root1,BSTNode root2)
{
if(root1==root2) return true;
if(root1.data!=root2.data) return false;
Queue<BSTNode> q1=new LinkedList<>();
Queue<BSTNode> q2=new LinkedList<>();
q1.add(root1);
q2.add(root2);
while(!q1.isEmpty() && !q2.isEmpty())
{
BSTNode n1=q1.peek();
BSTNode n2=q2.peek();
if(n1.data!=n2.data) return false;
q1.remove();
q2.remove();
if(n1.left!=null && n2.left==null || n1.right==null && n2.right!=null) return false;
if(n1.left!=null && n2.left!=null)
{
if(n1.left.data!=n2.left.data) return false;
q1.add(n1.left);
q2.add(n2.left);
}
if(n1.right!=null && n2.right!=null)
{
if(n1.right.data!=n2.right.data) return false;
q1.add(n1.right);
q2.add(n2.right);
}
}
return true;
}

public static boolean pathWithSumExists(BSTNode root,int sum)
{
if(root==null) return false;
sum=sum-(root.data);
if(isLeafNode(root)==true) return sum==0;
if(root.left!=null && pathWithSumExists(root.left,sum)) return true;
if(root.right!=null && pathWithSumExists(root.right,sum)) return true;
return false;
} 

public static boolean isLeafNode(BSTNode root)
{
return root.left==null && root.right==null;
}
public static int diameterOfBST(BSTNode root)
{
if(root==null) return 0;
int lh=getHeight(root.left);
int rh=getHeight(root.right);
int ldiameter=diameterOfBST(root.left);
int rdiameter=diameterOfBST(root.right);
return Math.max(lh+rh+1,(Math.max(ldiameter,rdiameter)));
}

public static int _diameterOfBST(BSTNode root)
{
int diameter=diameterOfBST(root);
return diameter;
}

public static void leftView(BSTNode root)
{
Queue<BSTNode> queue=new LinkedList<>();
queue.add(root);
int added=1;
while(!queue.isEmpty())
{
int r=1;
int k=0;
while(r<=added)
{
BSTNode t=queue.remove();
if(r==1) System.out.println(t.data);
if(t.left!=null)
{
queue.add(t.left);
k++;
}
if(t.right!=null)
{
queue.add(t.right);
k++;
}
r++;
}
added=k;
}
}

public static void rightView(BSTNode root)
{
Queue<BSTNode> queue=new LinkedList<>();
queue.add(root);
int added=1;
while(!queue.isEmpty())
{
int r=1;
int k=0;
while(r<=added)
{
BSTNode t=queue.remove();
if(r==1) System.out.println(t.data);
if(t.right!=null)
{
queue.add(t.right);
k++;
}
if(t.left!=null)
{
queue.add(t.left);
k++;
}
r++;
}
added=k;
}
}

static class pair
{
int first,second;
pair(){}
pair(int i,int j)
{
first=i;
second=j;
}
}
static TreeMap<Integer,pair> m=new TreeMap<>();

static void topView(BSTNode root,int x,int y)
{
if(root==null) return;
if(m.get(x)==null) m.put(x,new pair(root.data,y));
else if(m.get(x).second>y) m.put(x,new pair(root.data,y));
topView(root.left,x-1,y+1);
topView(root.right,x+1,y+1);
}

static void topViewTree(BSTNode root)
{
topView(root,0,0);
for(Map.Entry<Integer,pair> entry:m.entrySet()) System.out.println(entry.getValue().first+" ");
}

public static int lca(BSTNode node,int n1,int n2)
{
if(node==null) return -1;
if(node.data<n1 && node.data<n2) return lca(node.right,n1,n2);
if(node.data>n1 && node.data>n2) return lca(node.left,n1,n2);
return node.data;
}

public static BSTNode mirror(BSTNode node)
{
if(node==null) return node;
BSTNode left=mirror(node.left);
BSTNode right=mirror(node.right); 
node.left=right;
node.right=left;
return node;
}

public static BSTNode mergeTwoBST(BSTNode root1,BSTNode root2)
{
if(root1==null) return root2;
if(root2==null) return root1;
root1.data=root1.data+root2.data;
root1.left=mergeTwoBST(root1.left,root2.left);
root2.right=mergeTwoBST(root1.right,root2.right);
return root1;
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

BST tree=new BST();
tree.root1 = new BSTNode(1);
tree.root1.left = new BSTNode(2);
tree.root1.right = new BSTNode(3);
tree.root1.left.left = new BSTNode(4);
tree.root1.left.right = new BSTNode(5);
  
tree.root2 = new BSTNode(1);
tree.root2.left = new BSTNode(2);
tree.root2.right = new BSTNode(3);
//tree.root2.left.left = new BSTNode(4);
tree.root2.left.right = new BSTNode(5);
  
while(true)
{
System.out.println("1. Insert");
System.out.println("2. Inorder Traversal");
System.out.println("3. Preorder Traversal");
System.out.println("4. Postorder Traversal");
System.out.println("5. Print Left BSTNodes");
System.out.println("6. Print Right BSTNodes");
System.out.println("7. Inorder Traversal Using Stack");
System.out.println("8. Preorder Traversal Using Stack");
System.out.println("9. Postorder Traversal Using Stack");
System.out.println("10. Height of tree");
System.out.println("11. Print Leaf BSTNodes");
System.out.println("12. Level Order Traversal");
System.out.println("13. Level Order Traversal With Level Number");
System.out.println("14. Get Height without recursion");
System.out.println("15. Find Minimum Path From Root To Leaf BSTNode");
System.out.println("16. Compare Trees Using Recursion");
System.out.println("17. Compare Trees Without Recursion");
System.out.println("18. Path Sum(Root to leaf)");
System.out.println("19. Diameter Of BST");
System.out.println("20. Left View of BST");
System.out.println("21. Right View of BST");
System.out.println("22. Top View of BST");
System.out.println("23. Least Common Ancestor");
System.out.println("24. Mirroring a binary tree");
System.out.println("25. Merge two BST");

System.out.println("30. Exit");

System.out.print("Enter your requirement : ");
int ch=sc.nextInt();
if(ch==2) inOrder(root);
if(ch==3) preOrder(root);
if(ch==4) postOrder(root);
if(ch==5) printLeftBSTNodes(root,false);
if(ch==6) printRightBSTNodes(root,false);
if(ch==7) inorderUsingStack(root);
if(ch==8) preorderUsingStack(root);
if(ch==9) postorderUsingStack(root);
if(ch==10) System.out.println("Height of the tree : "+getHeight(root));
if(ch==11) printLeafBSTNodes(root);
if(ch==12) levelOrderTraversal(root);
if(ch==13) levelOrderTraversalWithLevelNumber(root);
if(ch==14) System.out.println("Height of the tree : "+getHeightWithoutRecursion(root));
if(ch==15) findMinPathFromRootToLeafBSTNode(root);
if(ch==16)
{
if(compareTrees(root1,root2)) System.out.println("Trees are same");
else System.out.println("Trees are not same");
}
if(ch==17)
{
if(compareTreesWithoutRecursion(root1,root2)) System.out.println("Trees are same");
else System.out.println("Trees are not same");
}
if(ch==18) System.out.println("Path exists : "+pathWithSumExists(root,290));
if(ch==19) System.out.println("Diameter of BST : "+_diameterOfBST(root));
if(ch==20) leftView(root);
if(ch==21) rightView(root);
if(ch==22) topViewTree(root);
if(ch==23) System.out.println("LCA is : "+lca(root,65,25));
if(ch==24) 
{
System.out.println("Before mirroring inOrder : ");
inOrder(root);
mirror(root);
System.out.println("After mirroring : ");
inOrder(root);
}
if(ch==25)
{
BSTNode node=mergeTwoBST(root1,root2);
inOrder(node);
}
if(ch==30) System.exit(0);
}
}
}