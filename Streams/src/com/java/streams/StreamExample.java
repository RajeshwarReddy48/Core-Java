package com.java.streams;
import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people= Arrays.asList(
				new Person("Rajeshwar","Reddy",25),
				new Person("Nishanth","kumar",24),
				new Person("Rajashekar","Reddy",24),
				new Person("Harish","Rao",40),
				new Person("Narendra","Modi",80)
				);

		people.stream()
		.filter(p->p.getLastName().startsWith("R"))
		.forEach(p->System.out.println(p.getFirstName()+" "+p.getLastName()));
		
		long count= people.parallelStream()
				.filter(p->p.getLastName().startsWith("R"))
				.count();
		System.out.println(count);
	}

}
