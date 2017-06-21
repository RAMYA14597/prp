import java.util.Scanner;
class stringreverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
int i,l;
l=s.length();
for(i=l-1;i>=0;i--)
{
System.out.println(s.charAt(i)+" ");
}
}
}
