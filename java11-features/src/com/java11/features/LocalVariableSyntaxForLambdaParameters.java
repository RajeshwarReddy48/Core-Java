package com.java11.features;

public class LocalVariableSyntaxForLambdaParameters {
	
	public static void main(String[] args) {
		// Local variable types in lambda expressions parameters
		var str="rajeshwar";
		var integer=1248;

		FuncInterface funcObj=(var a, var b)->a+b;// we can't declare as one variable as "var" other as "int" 
	}
	

}

interface FuncInterface
{
	int operation(int a, int b);
}