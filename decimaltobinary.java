import java.util.Scanner;

public class decimaltobinary {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the decimal number: ");
			    int num=sc.nextInt();
			    if(num<0)
			    {
			    System.out.println("enter the positive number");	
			    }	
			    else
			    {
			    	System.out.println("The corresponding binary of "+num+" is: ");
			    	decimal1(num);
			    	
			    }
	}
	public static void decimal1(int num)
	{
		if(num<=1)
		{
			System.out.print(num);
			return;
			
		}
			int rem=num%2;
			decimal1(num>>1);
			System.out.print(rem);
		
		
		
	}

}
