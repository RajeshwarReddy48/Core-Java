
public class Employee1Details {

	int empID;
	String empName;
	int age;
	String role;
	public Employee1Details( int empID,String empName,int age,String role)
	{
		this.empID= empID;
		this.empName=empName;
		this.age=age;
		this.role=role;
	}
	
	public void  displayEmpID()
	{
		System.out.println("Employee id is: "+ empID);
	}
	public void  displayEmpName()
	{
		System.out.println("Employee Name is: "+ empName);
	}
	public void  displayAge()
	{
		System.out.println("Employee Age is: "+ age);
	}
	public void  displayRole()
	{
		System.out.println("Employee Role is: "+ role);
	}	
	

}
