package com.java.lambdaexpressions;

public class LambdaExamples {
	
	public void display(GreetingInterface gi)
	{
		gi.greet();	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String lambda;
		LambdaExamples le=new LambdaExamples();
		
         //@SuppressWarnings("unused")
		//GreetingInterface helloWorldGreeting=new HelloWorldGreeting();
		GreetingInterface lambdaGreeting= () -> System.out.print("Hello World!");
		//lambdaGreeting.greet();
		
		GreetingInterface innerClassGreeting=new GreetingInterface()
				{
			      public void greet() {
			    	  System.out.println("Hello World!");
			      }
				};
		
				
				le.display(lambdaGreeting);
				le.display(innerClassGreeting);
				

	}
	
	

}
/*
interface MyLambda
{
	void display();
}
*/