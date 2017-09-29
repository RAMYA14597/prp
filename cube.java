import java.util.Scanner;
public class cone {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int b=sc.nextInt();
int h=sc.nextInt();
int tsa,v;
tsa=2*(l*b+b*h+h*l);
v=l*b*h;
System.out.println(tsa+" "+v);
	}

}
