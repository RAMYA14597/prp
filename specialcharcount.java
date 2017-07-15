package rraa;

import java.util.Scanner;

public class specialcharcount
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String ss=sc.next();
int i,count=0;
for(i=0;i<ss.length();i++)
{
	char ch=ss.charAt(i);
	if(Character.isDigit(ch))
	{
		char f=ch;
		}
	else if(Character.isAlphabetic(ch))
	{
		char g=ch;
	}
	else
	{
		count++;
	}
}
System.out.println(count);

	}

}
