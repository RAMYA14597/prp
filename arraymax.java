import java.util.Arrays;
import java.util.Scanner;
public class arraymax {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a[]=new int[25];
int i,k;
k=a.length;
for(i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}
Arrays.sort(a);
System.out.println(a[k-1]);
}
}
