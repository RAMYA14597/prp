import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int sum;
  int tmp=num;
while(num>0)
{
int n=num%10;
sum=(sum*10)+n;
}
if(tmp==sum)
{
System.out.println("palindrome");
}
else
{
System.out.println(" not a palindrome");
}
}
}

