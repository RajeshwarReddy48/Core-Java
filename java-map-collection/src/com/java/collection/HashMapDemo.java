package com.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Java HashMap contains values based on the key.
		   Java HashMap contains only unique keys.
		   Java HashMap may have one null key and multiple null values.
		   Java HashMap is non synchronized.
		   Java HashMap maintains no order. 
		   
		   
		 *Map map=new HashMap();  
	    //Adding elements to map  
	    map.put(1,"Amit");  
	    map.put(5,"Rahul");  
	    map.put(2,"Jai");  
	    map.put(6,"Amit");  
	    //Traversing Map  
	    Set set=map.entrySet();//Converting to Set so that we can traverse  
	    Iterator itr=set.iterator();  
	    while(itr.hasNext())
	    {  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  */
		Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay"); 
		  map.put(105,"Amit");  

		  map.put(102,"Rahul");  
		  //Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	    
	}

}
