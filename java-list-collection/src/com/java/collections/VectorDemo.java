package com.java.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Vector uses a dynamic array to store the data elements. 
		 * It is similar to ArrayList. 
		 * However, It is synchronized and contains many methods that are not the part of Collection framework.
		 */

		Vector<String> v=new Vector<String>();  
		v.add("Laxmikanth");  
		v.add("Vaishak");  
		v.add("Ramakanth");  
		v.add("Vaishak");  
		v.add("Achyuth");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  

	}

}
