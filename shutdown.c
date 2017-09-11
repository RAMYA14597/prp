#include<stdio.h>
#include<conio.h>
void main()
{
char c1;
printf("Do you want to shutdown the computer (y/n)\n");
scanf("%c",c1);
if(c1=='y' || c1=='Y')
{
SYSTEM("C:\\WINDOWS\\SYSTEM32\\SHUTDOWN /s");
}
}
