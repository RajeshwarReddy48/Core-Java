interface Employee
{  
void print();  
}  
interface Manager 
{  
void show();  
}  
class Chairman implements Manager,Employee
{  
public void print()
{
	System.out.println("Employee is ready to give interview for the project manager");
}  
public void show()
{
	System.out.println("Project manager conducts interview and passes information to HR");
	}  
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chairman c = new Chairman();  
		c.print();  
		c.show();  

	}

}
