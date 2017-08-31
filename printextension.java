import java.util.Scanner;
public class printextension {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s1=sc.next();
int i,k;
k=s1.length();
for(i=0;i<k;i++)
{
	if(s1.charAt(i)=='.')
	{
		System.out.println(s1.substring(i+1));
	}
}
}}
