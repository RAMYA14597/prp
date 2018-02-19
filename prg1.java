import java.util.Scanner;
public class prg1 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s1=sc.next();
int i,c=0;
for(i=0;i<s1.length();i++)
{
	if(Character.isDigit(s1.charAt(i)))
	{
		c++;
	}
}
if(c==s1.length())
{
	System.out.println("yes");
}
else
{
	System.out.println("no");
}
	}

}
