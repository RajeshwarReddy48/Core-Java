package com.java.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayDeque class implements the Deque interface. 
		 * It facilitates us to use the Deque. 
		 * Unlike queue, we can add or delete the elements from both the ends.
          ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
		 */
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		//Traversing elements  
		for (String str : deque) 
		{  
		System.out.println(str);  
		}  
	}

}
