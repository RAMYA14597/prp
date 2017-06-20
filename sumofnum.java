import java.util.Scanner;
public class sumofnum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int i,sum=0;
        for(i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of numbers less than a number is :"+sum+" ");
    }
}
