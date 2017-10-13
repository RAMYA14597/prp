import java.util.Scanner;
public class rotate {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int a[]=new int[n];
String x="";
String y="";
int i,j;
for(i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
for(i=k+1;i<a.length;i++)
{
	x=x+a[i]+" ";
}
for(i=0;i<=k;i++)
{
	y=y+a[i]+" ";
}

System.out.println(x+y);

}

}
