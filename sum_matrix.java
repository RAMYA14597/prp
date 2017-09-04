import java.util.Scanner;
public class sum_matrix {
public static void main(String[] args) 
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int a[][]=new int[m][n];
int b[][]=new int[m][n];
int sum[][]=new int[m][n];
int i,j;
for(i=0;i<m;i++)
{
	for(j=0;j<n;j++)
	{
		a[i][j]=sc.nextInt();
	}
}
for(i=0;i<m;i++)
{
	for(j=0;j<n;j++)
	{
		b[i][j]=sc.nextInt();
	}
}
for(i=0;i<m;i++)
{
	for(j=0;j<n;j++)
	{
		sum[i][j]=a[i][j]+b[i][j];
	}
}
for(i=0;i<m;i++)
{
	for(j=0;j<n;j++)
	{
		System.out.print(sum[i][j]+" ");
	}
	System.out.print("\n");
}
	}

}
