#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
int *x,*y;
clrscr();
scanf("%d %d",&a,&b);
x=&a;
y=&b;
c=*x+*y;
printf("%d",c);
}
