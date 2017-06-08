
import java.util.Scanner;
class leapyear
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if((n%400&& n%4&&n%100)==0)
{
System.out.println("Leap year");
}
else
{
System.out.println("not a Leap year");
}
}
}
