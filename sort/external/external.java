import java.util.*;
class QuickSort
{
public static int findPartitionPoint(int []x,int lb,int ub)
{
int e,f,g;
e=lb;
f=ub;
while(e<f)
{
while(e<ub && x[e]<=x[lb]) e++;
while(x[f]>x[lb]) f--;
if(e<f)
{
g=x[e];
x[e]=x[f];
x[f]=g;
}
else
{
g=x[lb];
x[lb]=x[f];
x[f]=g;
}
}
return f;
}
public static void quickSort(int []x,int lb,int ub)
{
int pp;
if(ub<=lb) return;
pp=findPartitionPoint(x,lb,ub);
quickSort(x,lb,pp-1);
quickSort(x,pp+1,ub);
}
public static void main(String args[])
{
}
}



int contentOfFile[10],count,smallest,e,i,size,numberOfRecords,total,num1,num2,num;
char fn[100];
char *fileName;
int *elements;
FILE *f1,*f2,*f3;


f1=fopen("data.d","rb");

fseek(f1,0,2); // takes pointer to end of file
size=ftell(f1);
fseek(f1,0,SEEK_SET); // takes pointer to start of the file
numberOfRecords=size/sizeof(int);
total=numberOfRecords/10;
for(e=1;e<=10;e++)
{
sprintf(fn,"data%d.d",e);
// sprintf stands for "String print".Instead of printing on console,it
// store output on char buffer (fn) which are specified in sprintf

fileName=(char *)malloc(sizeof(char)*strlen(fn));
strcpy(fileName,fn);
// it copies the string pointed by fn to fileName
elements=(int *)malloc(total*sizeof(int));

fread(elements,sizeof(int),total,f1);

quickSort(elements,0,total-1);

f2=fopen(fileName,"wb");
fwrite(elements,sizeof(int),total,f2);
free(fileName);
free(elements);
fclose(f2);
}
fclose(f1);
FILE *f[10];
for(e=0;e<10;e++)
{
sprintf(fn,"data%d.d",e+1);
fileName=(char *)malloc(sizeof(char)*strlen(fn));
strcpy(fileName,fn);
f[e]=fopen(fileName,"rb");
fread(&contentOfFile[e],sizeof(int),1,f[e]);
free(fileName);
}
count=0;
i=0;
f3=fopen("newData1.d","wb");
smallest=contentOfFile[0];
while(1)
{
if(count==10)
{
break;
}
smallest=contentOfFile[0];
i=0;
for(e=1;e<10;e++)
{
if(smallest>contentOfFile[e])
{
smallest=contentOfFile[e];
i=e;
}
}
fwrite(&smallest,sizeof(int),1,f3);
fread(&contentOfFile[i],sizeof(int),1,f[i]);
if(feof(f[i])) // checks whether if end of file is reached or not,if
// reached then non-zero otherwise returns 0
{
count++;
contentOfFile[i]=2147483647;
}
}
for(e=0;e<10;e++)fclose(f[e]);
fclose(f3);
return 0;
