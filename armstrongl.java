import java.util.Scanner;
class armstrongl
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int limit=sc.nextInt();
int k,i,sum;
for(i=1;i<=limit;i++)
{
k=i;
sum=0;
while(k!=0)
{
int x=k%10;
sum=sum+(x*x*x);
k=k/10;
}
if(sum==i)
{
System.out.print(i+"\t");
}
}
}
}


