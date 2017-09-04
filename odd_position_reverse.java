import java.util.Scanner;
public class odd_position_reverse {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String a[]=s1.split(" ");
int i;
for(i=0;i<a.length;i++)
{
	if(i%2==0)
	{
		StringBuffer ss=new StringBuffer(a[i]);
		System.out.print(ss.reverse());
	}
	else
	{
		System.out.print(a[i]);
	}
	System.out.print(" ");
}
	}
}
