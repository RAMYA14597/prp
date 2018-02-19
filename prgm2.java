import java.util.Scanner;
public class prgm2 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s1=sc.next();
int i;
for(i=0;i<s1.length();i++)
{
	if(Character.isUpperCase(s1.charAt(i)))
	{
		System.out.print(Character.toLowerCase(s1.charAt(i)));
	}
	else
	{
		System.out.print(Character.toUpperCase(s1.charAt(i)));
	}
}
	}

}
