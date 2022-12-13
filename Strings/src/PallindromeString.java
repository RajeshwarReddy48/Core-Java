import java.util.Scanner;

public class PallindromeString {
	
	   public static void main(String args[])  
	   {  
	      String original, pallindrome = ""; // Objects of String class  
	      Scanner sc = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      original = sc.nextLine();   
	      int len = original.length();   
	      for ( int i = len - 1; i >= 0; i-- )  
	      {
	         pallindrome = pallindrome + original.charAt(i);  
	      }
	      if (original.equals(pallindrome))  
	      {
	         System.out.println("Entered string/number is a palindrome.");  
	      }
	      else  
	      {
	         System.out.println("Entered string/number isn't a palindrome.");   
	      }
	   }  
	}  
