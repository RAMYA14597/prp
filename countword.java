import java.util.Scanner;

public class countword {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String[] ss=s.split(" ");
	    int count=0;
	    for(String g:ss)
	    {
	    	count++;
	    }
	    System.out.println("The number of words is "+count);
	}

}
