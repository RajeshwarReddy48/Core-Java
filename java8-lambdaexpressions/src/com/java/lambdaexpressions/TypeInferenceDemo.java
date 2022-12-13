package com.java.lambdaexpressions;

public class TypeInferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*StringLengthLambda myStringLength= (String s)-> s.length();
		//(s)->s.length();
		//s->s.length();*/
		
		printLambda(s->s.length());
	   }
		
    public static void printLambda(StringLengthLambda sll) 
		{
		System.out.println(sll.getStringLength("Rajeshwar Reddy Sanjannola"));
		}

}

interface StringLengthLambda
{
	int getStringLength(String s);
}