
import java.util.Scanner;
class power
{
Public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number:");
int num=sc.nextInt();
System.out.println("Enter power:");
int pow=sc.nextInt();
int n=1,i;
for(i=0;i<pow;i++)
{
n=n*num;
}
System.out.println(n+" ");
}
}
