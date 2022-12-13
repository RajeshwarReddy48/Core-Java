import java.util.Scanner;

public class StringReverse 
{
	public static void main(String args[])
	{
	String input;
		
		Scanner sc = new Scanner(System.in);   
	      System.out.println("Enter a string/number to reverse it: ");  
	      input = sc.nextLine();   
	
         char[] rev = input.toCharArray();
     	System.out.print("Reverse of the given string is :");

         for (int i = rev.length-1;i >= 0; i--)
    	{
    	System.out.print(rev[i]);
    	}
    
 }


}
