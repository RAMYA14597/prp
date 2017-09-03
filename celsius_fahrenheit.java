import java.util.Scanner;
public class celsius_fahrenheit {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Double num=sc.nextDouble();
Double cel=((num*9/5.0)+32);
System.out.println(num+" celsius is "+cel+" fahrenheit");
	}

}
