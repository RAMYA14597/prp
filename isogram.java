import java.util.Scanner;
public class isogram{
	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				String s1=sc.next();
				int i,j,k,flag=0;
				k=s1.length();
				for(i=0;i<k;i++)
				{
					for(j=i+1;j<k;j++)
					{
						if(s1.charAt(i)==s1.charAt(j))
						{
							flag=1;
						}
						}
				}
				if(flag==1)
				{
					System.out.println("Not-Isogram");
				}
				else
				{
					System.out.println("Isogram");
				}
			}}


