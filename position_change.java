import java.util.Scanner;
public class position_change {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s1=sc.next();
int i;
String a1="";
String a2="";
for(i=0;i<s1.length();i++)
{
	if(i%2==0)
	{
		a1=a1+s1.charAt(i);
	}
	else
	{
		a2=a2+s1.charAt(i);
	}
}
System.out.print(a1+" "+a2);
	}

}
