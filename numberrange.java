import java.util.Scanner;
public class numberrange {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
try{
if(num<=100 && num>=0){
	System.out.println(num);
}
else if(num<0){
	throw new NumberFormatException();
}
else{
	throw new Exception();
}}
catch(NumberFormatException ef){
	System.out.println("java.lang.Exception:Error!!Entered limit is of Negative Range...");
	System.out.println("Please Enter the valid input...!!!");
	System.exit(0);
}
catch(Exception e)
{
System.out.println("java.lang.Exception:Error!!Entered limit is out of Range...");
System.out.println("Please Enter the valid input...!!!");
System.exit(0);
}}}
