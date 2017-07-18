#include<stdio.h>
#include<conio.h>
void main()
{
int a[10];
int i,j,min=0,max=0,n;
clrscr();
printf("enter the size of array");
scanf("%d",&n);
for(i=0;i<n;i++)
{
 scanf("%d",&a[i]);
}
min=a[0];
max=a[0];
for(i=0;i<n;i++)
{
if(a[i]>max)
{
max=a[i];
}
if(a[i]<min)
{
min=a[i];
}
}
printf("MIN=%d",min);
printf("\n");
printf("MAX=%d",max);
}


