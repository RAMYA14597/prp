public class sumodd
{
    public static void main(String args[])
    {
        int i,sum=0,j,sum1=0;
        for(i=1;i<=15;i++)
        {
            sum=sum+i;
            }
            System.out.println(sum+"");
        for(j=15;j<=45;j++)
        {
            if(j%2!=0)
            {
                sum1=sum1+j;
            }
        }
              System.out.println(sum1+"");  
    }
}
