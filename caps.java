import java.util.Scanner;
public class caps {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String  s1=sc.nextLine();
String b[]=s1.split(" ");
int i,j;
for(i=0;i<b.length;i++)
{
	for(j=0;j<b[i].length();j++)
	{
		if(j==0)
		{
			System.out.print(Character.toUpperCase(b[i].charAt(j)));
		}
		else
		{
			System.out.print(b[i].charAt(j));
		}
	}
	System.out.print(" ");
}
	}

}
