package com.java11.features;

import java.util.List;
import java.util.stream.Collectors;

public class StringAPIEnhancements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello \n"
				+ "Welcome \n"
				+ "Goodbye";
		// 1. lines() method
	    str.lines().forEach(System.out::println);
	    List<String> res= str.lines().collect(Collectors.toList());// prints output in lines
	    System.out.println(res);
	    
	    //2. isBlank() method
		System.out.println(str.isBlank());// returns true if it is blank
		System.out.println(str.isEmpty());
		
		//3. strip() method
		String a="  rfaghsfsc ";// gives output without spaces
		System.out.println(a.strip());
		System.out.println(a.stripLeading());// removes last whitespace and prints output
		System.out.println(a.stripTrailing());// prints output with all trailing whitespace removed
		System.out.println(a);
		System.out.println(a.trim());// prints output with all leading and trailing whitespace removed
		
		System.out.println(a.repeat(5));// prints five times the value in output
		
		
		
	}

}
