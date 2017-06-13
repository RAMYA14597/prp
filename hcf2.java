import java.util.Scanner;
public class hcf2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,r;
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        x=n1;
        y=n2;
        while(n2>0)
        {
            r=n1%n2;
            n1=n2;
            n2=r;
        }
        int gcd=n1;
        System.out.println(gcd+"");
    }
}
