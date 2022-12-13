package com.java11.features;

import java.util.Optional;

public class OptionalEmptyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Optional class isEmpty() method
		
		Optional o=Optional.of(" ");// here space is considered as not empty
		o=o.empty();
	
		System.out.println(o.isEmpty());
		

	}

}
