import java.util.Scanner;
class armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int sum=0,k=num;
for(int i=0;i<num;i++)
{
while(k!=0)
{
int x=k%10;
sum=sum+(x*x*x);
k=k/10;
}
}
if(sum==num)
{
System.out.println("Armstrong number");
}
else
{
    System.out.println("Not an Armstrong number");
}
}
}
