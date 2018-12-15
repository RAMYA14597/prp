package guvi_prgms;

import java.util.Scanner;

public class sum_of_squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();

int res=0,n2;
while(N>0)
{
n2=N%10;
res=res+(n2*n2);
N=N/10;
}
System.out.println(res);
	}
	

}
