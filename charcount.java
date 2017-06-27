import java.util.Scanner;
public class charcount
{
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=" ";
int count=0;
s2=s1;
for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)==s2.charAt(i))
{
count++;
}
}
System.out.println(count);
}
}
