import java.util.Scanner;
class factorial1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        if(num>0)
        {
            for(int i=1;i<=num;i++)
            {
              fact=fact*i;
            }
              System.out.println("the Factorial is:"+fact);
        }
            else
            {
                System.out.println("Factorial not possible");
            }
    }
}
