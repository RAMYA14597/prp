import java.util.Scanner;
public class char_print {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
char[] s="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
int i;
if(a<=26)
{
System.out.println(Character.toString(s[a-1]));
}
else
	{
	System.out.println("null");
	}
	}

}

