import java.Scanner;
class digit
{
public static void main(String args[]);
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int sum=0;
while(num>0)
{
int a=n%10;
sum=sum+a;
n=n/10;
}
System.out.println(sum+" ");
}
}
