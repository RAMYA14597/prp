import java.util.Scanner;
public class sumarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int a1[]=new int[a];
		int b1[]=new int[a];
		int sum[]=new int[a];
		int i;
		for(i=0;i<a1.length;i++)
		{
		a1[i]=sc.nextInt();
		}
		for(i=0;i<b1.length;i++)
		{
		b1[i]=sc.nextInt();
		}
		for(i=0;i<a;i++)
		{
		sum[i]=a1[i]+b1[i];	
		System.out.print(sum[i]+" ");
		}
	}

}
