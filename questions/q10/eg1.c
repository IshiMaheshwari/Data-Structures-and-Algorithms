// 10. To check the linked list is pallindrome. 

#include<stdio.h>
#include<stdlib.h>
struct Node
{
int data;
struct Node * next;
};
struct Node * start=NULL;
struct Node * createNode(int data)
{
struct Node *t;
t=(struct Node *)malloc(sizeof(struct Node));
t->data=data;
t->next=NULL;
return t;
}
void createLinkedList()
{
struct Node *n1,*n2,*n3,*n4,*n5;
n1=createNode(10);
n2=createNode(20);
n3=createNode(30);
n4=createNode(20);
n5=createNode(10);
start=n1;
n1->next=n2;
n2->next=n3;
n3->next=n4;
n4->next=n5;
}
void releaseStack(struct Node *b)
{
struct Node *t;
t=(struct Node *)malloc(sizeof(struct Node));
t=b;
b=b->next;
free(t);
}
int isPallindrome(struct Node *b)
{
struct Node *p1,*p2,*top,*t;
top=NULL;
int count=1;
if(b==NULL) return 0;
if(b->next==NULL) return 1;
p2=b;
p1=b->next;
// push a node on stack
t=createNode(p2->data);
t->next=top;
top=t;

while(p1!=NULL)
{
p2=p2->next;
//push p2(a node) on stack
t=createNode(p2->data);
t->next=top;
top=t;

if(p1->next==NULL)
{
count+=1;
break;
}
p1=p1->next->next;
count+=2;
}
if(count%2==0)
{
// pop a node from stack
t=top;
top=top->next;
free(t);
}
while(p2!=NULL)
{
// compare p2->data with top->data if not equal
if(p2->data!=top->data)
{
releaseStack(top);
return 0;
}
// pop a node from stack
t=top;
top=top->next;
free(t);
p2=p2->next;
}
return 1;
}
int main()
{
createLinkedList();
if(isPallindrome(start)) printf("Pallindrome");
else printf("Not a pallindrome");
return 0;
}