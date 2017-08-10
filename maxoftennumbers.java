import java.util.Arrays;
import java.util.Scanner;

public class maxoftennumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		Arrays.sort(num);
		System.out.println(num[n-1]);
	}

}
