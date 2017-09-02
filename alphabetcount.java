import java.util.Scanner;
public class alphabetcount {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    int i,count=0;
	    for(i=0;i<s.length();i++)
	    {
	    	if(Character.isLetter(s.charAt(i)))
	    	{
	    		count++;
	    	}
	    }
	    System.out.println(count);
	}
}
