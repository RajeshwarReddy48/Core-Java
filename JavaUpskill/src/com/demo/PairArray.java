package com.demo;

public class PairArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,3,4,6,2,1};
		int sum=4;

		
		for (int i = 0; i < arr.length; i++)
	    {
	       // read i'th element to last element
	        for (int j = i ; j < arr.length; j++)
	        {
	            // if given sum is found
	            if (arr[i] + arr[j] == sum)
	            {
                    System.out.println("Pair found (" + arr[i] + "," + arr[j] + ")");
                   // return;

	            }
	                
	            }
	        }
	}

}
