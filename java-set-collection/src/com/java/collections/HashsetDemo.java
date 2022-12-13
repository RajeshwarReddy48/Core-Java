package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * HashSet class implements Set Interface. 
		 * It represents the collection that uses a hash table for storage. 
		 * Hashing is used to store the elements in the HashSet. It contains unique items.
		 */
		HashSet set=new HashSet<>(); 
		set.add(2);
		set.add("Rajeshwar");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Bhanu");  
		set.add("Ajay");  
		set.add(1248);
		System.out.println("Printing names");

		System.out.println(set);

		//Traversing elements  
		/*for(String names:set)
		{
			System.out.println(names);
		}*/

		/*
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  */
		
		HashSet<Integer> iset=new HashSet<>(); 
		//set.add(2);
		iset.add(1248);  
		iset.add(1235);  
		iset.add(1210);  
		iset.add(1213);  
		//Traversing elements 
		System.out.println("Printing inetegers");

		for(int num:iset)
		{
			System.out.println(num);
		}

	}

}
