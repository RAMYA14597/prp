import java.util.Scanner;
public class swap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int tmp;
        tmp=x;
        x=y;
        y=tmp;
        System.out.println(x+" "+y+" ");
    }
}
