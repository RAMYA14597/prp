import java.util.Scanner;
public class perfect_check {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,sum=0;

for(i=1;i<n;i++)
{
	if(n%i==0)
	{
		sum=sum+i;
	}
}
if(sum==n)
{
	System.out.println("perfect number");
}
else
{
	System.out.println("Not_perfect number");
}
	}

}
