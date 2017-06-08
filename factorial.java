import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int fact=1,i;
if(num<0)
{
System.out.println("Factorial is not possible");
}
else
{
for(i=num;i>=1;i--)
{
fact=fact*i;
}
System.out.println("Factorial is "+fact);
}
}}
