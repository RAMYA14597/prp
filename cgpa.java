import java.util.Scanner;
public class cgpa {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sub=sc.nextInt();
		float a[]=new float[sub];
		float b[]=new float[sub];
		int i;
		float cgpa;
		float sum=0;
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();	
		}
		for(i=0;i<a.length;i++)
		{
			b[i]=(a[i]/10);
		}
		for(i=0;i<a.length;i++)
		{
		sum=sum+b[i];
	    }
		cgpa=sum/sub;
		System.out.println(cgpa);
		}
}
