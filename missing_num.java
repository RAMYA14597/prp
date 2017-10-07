import java.util.Scanner;
public class missing_num {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int i,j,tot;
for(i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
tot=(((n+1)*(n+2))/2);
for(i=0;i<n;i++)
{
	tot=tot-a[i];
}
System.out.println(tot);
	}

}
