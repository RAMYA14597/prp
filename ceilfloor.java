import java.util.Scanner;
public class ceilfloor {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double num=sc.nextDouble();
double x,y;
x=Math.ceil(num);
y=Math.floor(num);
System.out.println("Round of value of "+num+" is "+x);
System.out.println("Round of value of "+num+" is "+y);
	}

}
