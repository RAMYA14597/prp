import java.util.Scanner;
public class add_without_arithmetic_bitwise {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		while(a--!=0)
		{
			b++;
		}
		System.out.println("The addition of two numbers without using arithmetic & bitwise operator is: "+b);
	}

}
