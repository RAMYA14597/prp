import java.util.Scanner;

public class digitornot{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s1=sc.next();
boolean m=true;
int i=s1.charAt(0);
if(Character.isDigit(i))
	{
		System.out.println(m);
	}
else
{
m=false;
System.out.println(m);
}

	}
