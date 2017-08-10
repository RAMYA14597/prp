import java.util.Scanner;

public class allcount {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s1=sc.next();
int i,k;
int ch=0,num=0,sp=0;
k=s1.length();
for(i=0;i<k;i++)
{
	if(Character.isDigit(s1.charAt(i)))
	{
	num++;	
	}
	else if(Character.isLetter(s1.charAt(i)))
	{
		ch++;
	}
	else
	{
		sp++;
	}
}
  System.out.println("character count is: "+ch);
	System.out.println("number count is: "+num);
	System.out.println("special character count is: "+ch);

	}

}
