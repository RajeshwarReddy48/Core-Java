package com.demo;
import java.util.StringTokenizer;  

public class StringTokenizerExample {
	
	 public static void main(String args[]){  
		 /*The java.util.StringTokenizer class allows you to break a String into tokens.
		  *  It is simple way to break a String. It is a legacy class of Java.
        It doesn't provide the facility to differentiate numbers, quoted strings, identifiers etc. like StreamTokenizer class.
        In the StringTokenizer class, the delimiters can be provided at the time of creation or one by one to the tokens.
        Constructors:-
StringTokenizer(String str)	
StringTokenizer(String str, String delim)	
StringTokenizer(String str, String delim, boolean returnValue)	

*/
	   StringTokenizer st = new StringTokenizer("My Name is Rajeshwar Reddy Sanjannola");  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	     }  
	   }  
	

}
