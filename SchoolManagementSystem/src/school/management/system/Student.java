package school.management.system;

public class Student {
	private int id;
	private String name;
	private int stnd;
	private int feesTotal;
	private int feesPaid;
	
	public Student(int id,String name,int stnd)
	{
		this.id=id;
		this.name=name;
		this.stnd=stnd;
		this.feesPaid=0;
		this.feesTotal=30000;
		
	}
	public void setStnd(int stnd)
	{
		this.stnd=stnd;
		
	}
	public void payFees(int fees)
	{
		feesPaid=feesPaid+fees;
		School.updateTotalMoneyEarned(feesPaid);
		
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getStnd()
	{
		return stnd;
	}
	public int getFeesPaid()
	{
		return feesPaid;
	}
	public int getFeesTotal()
	{
		return feesTotal;
	}
	
	public int getRemainingFees()
	{
		return feesTotal-feesPaid;
	}
	
	@Override
	public String toString() {
		return "Student's name is: "+name+" Total fees paid so far is: "+feesPaid;
	}
	
	

		
	
	
						
	

}
