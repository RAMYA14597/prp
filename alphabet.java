import java.util.Scanner;
class alphabet
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(Character.isLetter(ch))
{
System.out.println(ch+" is an alphabet");
}
else
{
System.out.println(ch+" is a not an alphabet");
}
}
}
