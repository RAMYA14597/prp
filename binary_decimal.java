import java.util.Scanner;
public class binary_decimal {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
int d=0;
int p=0,t;
while(b!=0)
{
	t=b%10;
	d+=t*Math.pow(2,p);
	p++;
	b=b/10;	
}
System.out.println(d);
	}
}
