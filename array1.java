import java.util.*;
public class array1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,b=0,c=0;
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                b=b+(a[i]*a[i]*a[i]);
                
            }
            else
            {
                c=c+a[i]*a[i];
                
            }
        }
        System.out.println(b+c);
    }
}
