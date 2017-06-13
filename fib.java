
import java.util.Scanner;
class fib
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.println(a+"\n"+b+"");
        c=a+b;
        while(c<=n)
        {
            System.out.println(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}
