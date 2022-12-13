package com.java.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Java TreeSet class implements the Set interface that uses a tree for storage. 
		 * Like HashSet, TreeSet also contains unique elements. 
		 * However, the access and retrieval time of TreeSet is quite fast. 
		 * The elements in TreeSet stored in ascending order.
		 */
		/*TreeSet<String> set=new TreeSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		*/
		 
			TreeSet set=new TreeSet();  
			set.add(1248);  
			set.add(1235);  
			set.add(1210);  
			set.add(1205);  
			//set.add("Rajeshwar");
			System.out.println(set);

			//traversing elements  
			/*Iterator<Integer> itr=set.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}  */
			

	}

}
