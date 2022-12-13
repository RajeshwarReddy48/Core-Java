package com.java.lambdaexpressions.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnitExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> people= Arrays.asList(
				new Person("Rajeshwar Reddy","Sanjannola",25),
				new Person("Srinivas Reddy","Sanjannola", 53),
				new Person("Supriya","Rayala",24),
				new Person("Chandrakala","Sanjannola",45)
				);
		
		//Step 1: Sort the list by last name
		Collections.sort(people,( p1,  p2)->p1.getLastName().compareTo(p2.getLastName()) );
		
		//Step 2: Create a method that Printing all the elements in the list
		System.out.println(" Printing all the persons");
		printAll(people);
		
		// Step 3: Create a method that prints all the person names start with S
		System.out.println(" Printing the person last names starts with S");
		printConditionally(people, p->p.getLastName().startsWith("S"));
		
		

	}



	private static void printAll(List<Person> people) {
		// TODO Auto-generated method stub
		for(Person p: people)
		{
			System.out.println(p);
		}
		
	}
	
	private static void printConditionally(List<Person> people, Condition condition) {
		// TODO Auto-generated method stub
		for(Person p: people)
		{
			if(condition.test(p))
			{System.out.println(p);
				
		}
		
	}

}
}
