package guvi_prgms;

import java.util.Scanner;

public class num_display_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
String s1=sc.next();
char ch;int i;
String s2="";
for(i=0;i<s1.length();i++)
{
	ch=s1.charAt(i);
	if(Character.isDigit(ch))
	{
		s2=s2+ch;
	}

}
System.out.println(s2);
	}

}
