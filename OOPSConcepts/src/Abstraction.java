//Example of an abstract class that has abstract and non-abstract methods  

 abstract class Bike
 {  
   Bike()
   {
	   System.out.println("Bike is ordered");
   }  
   abstract void run();  
  public  void changeGear()
   {
	   System.out.println("Gear changed");
	   }  
 }  
//Creating a Child class which inherits Abstract class  
 class Pulsar extends Bike
 {  
 public void run()
 {
	 System.out.println("Running Safely..");
  }  
 }  
//Creating a Test class which calls abstract and non-abstract methods  
 

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj = new Pulsar();  
		  obj.run();  
		  obj.changeGear();  

	}

}
