import java.util.Scanner;
public class uesrname_password{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s=sc.next();
int i,sum=0,avg,k;
char []a=s.toCharArray();
k=a.length;
for(i=0;i<a.length;i++)
{
	sum=sum+((int)a[i]);
}
avg=sum/k;
char c1=(char)avg;
System.out.println(c1);
	}

}
