package com.java.collection;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Java LinkedHashMap contains values based on the key.
Java LinkedHashMap contains unique elements.
Java LinkedHashMap may have one null key and multiple null values.
Java LinkedHashMap is non synchronized.
Java LinkedHashMap maintains insertion order.
		 */
		 LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();           
	     map.put(101,"Vijay");     
		 map.put(100,"Amit");    
	     map.put(102,"Rahul");    
	       //Fetching key  
	       System.out.println("Keys: "+map.keySet());  
	       //Fetching value  
	       System.out.println("Values: "+map.values());  
	       //Fetching key-value pair  
	       System.out.println("Key-Value pairs: "+map.entrySet());  

	}

}
