import java.util.Scanner;

public class primeornot {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i,n=0,flag=0;
n=num/2;
for(i=2;i<=n;i++)
{
	if(num%i==0)
	{
		System.out.println("not a prime number");
		flag=1;
		break;
		
	}
}
if(flag==0)
{
	System.out.println("prime number");
	
}
	}

}
