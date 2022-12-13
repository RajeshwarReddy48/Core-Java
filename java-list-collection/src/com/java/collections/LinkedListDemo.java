package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * LinkedList implements the Collection interface. 
		 * It uses a doubly linked list internally to store the elements. 
		 * It can store the duplicate elements. 
		 * It maintains the insertion order and is not synchronized. 
		 * In LinkedList, the manipulation is fast because no shifting is required.
		 */
		LinkedList ll=new LinkedList();  
		ll.add("Ravi");  
		ll.add("karna");  
		ll.add("Ravi");  
		ll.add("Ajay");  
		ll.add(1248);
		System.out.println(ll);

		
	/*	Iterator<String> itr=ll.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  */

	}

}
