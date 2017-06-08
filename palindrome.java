import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int sum;
while(num>0)
{
int n=num%10;
sum=n;
}
if(sum==num)
{
System.out.println("palindrome");
}
else
{
System.out.println(" not a palindrome");
}
}
}

