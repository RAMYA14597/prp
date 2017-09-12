import java.util.Scanner;
public class prime_intervals {
	public static void main(String[] args) {
		         int  flag = 0, i, j;
		         Scanner s = new Scanner(System.in);
		         int s1= s.nextInt();
		         int s2= s.nextInt();
		         for(i=s1;i<=s2;i++)
		         {
		             flag=0;
		             for(j=2;j<i1;j++)
		             {
		                 if(i%j==0)
		                 {
		                     flag=1;
		                 }
		             }
		             if(flag==0)
		                 System.out.print(i+" ");
		         }
		         System.out.println();
		         }
		    }
		
	

