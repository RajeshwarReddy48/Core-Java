package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The ArrayList class implements the List interface. 
		 * It uses a dynamic array to store the duplicate element of different data types. 
		 * The ArrayList class maintains the insertion order and is non-synchronized and not thread safe.
		 * The elements stored in the ArrayList class can be randomly accessed.
		 */
		ArrayList al=new ArrayList();//Creating arraylist  
		al.add("Rajeshwar");//Adding object in arraylist  
		al.add("Vijay");  
		al.add("Rajeshwar");  
		al.add(1249);
		al.add("Ajay");  
		al.add(1248);
		System.out.println(al);
		/*
		//Traversing list through Iterator  
		Iterator itr=al.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  
*/
	}

}
