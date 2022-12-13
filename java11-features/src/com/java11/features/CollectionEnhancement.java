package com.java11.features;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionEnhancement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collection API Enhancement toArray() method.
		// java.util package has toArray() method
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1248);
		al.add(1235);
		System.out.println(al);
		
		Integer[] arr= al.stream().toArray(size->new Integer[size]);
		System.out.println(Arrays.toString(arr));
		
		Integer[] arr1= al.toArray(Integer[]:: new);
		System.out.println(Arrays.toString(arr1));



	}

}
