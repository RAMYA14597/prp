#include<stdio.h>
#include<conio.h>
void main()
{
    int n;
    printf("enter the number");
    scanf("%d",&n);
    if(n>0 && n<=9)
    {
        printf("The number is:%d",n);
    }
    else
    {
        printf("you entered number is not valid");
    }
}
