import java.util.*;
class alphabetnum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="abcdefghijklmnopqrstuvwxyz";
        char b=sc.next().charAt(0);
        System.out.println("The assigned value for "+b+" is "+(s.indexOf(b)+1));
        
    }
    
}
