import java.util.Scanner;

public class lengthcount {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s[]=new String[n];
int i,count=0;
String ch="";
for(i=0;i<s.length;i++)
{
	s[i]=sc.next();
}
int lengthcheck=sc.nextInt();
for(i=0;i<s.length;i++)
{
	if(s[i].length()==lengthcheck)
	{
		count++;
	}
}
System.out.println(count);
	}

}
