abstract class Employee
{  
abstract void display();  
}  
class Manager extends Employee
{  
public void display()
{
	System.out.println("Interviewed Employee is hired for the project");
	}  
}  
class Chairman extends Employee
{  
public void display()
{
	System.out.println("Passes information to HR");
	}  
}   
public class AbstractExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Manager();  
		e.display();  
		
		Employee e1= new Chairman();
		e1.display();
		

	}

}
