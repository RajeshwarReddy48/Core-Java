class Addition
{  
static int add(int a,int b)
{
	return a+b;
	}  
static int add(int a,int b,int c)
{
	return a+b+c;
	}  
static int add(int a, int b, int c, int d)
{
	return a+b+c+d;
}
}  
public class MethodOverloading {

	public static void main(String[] args)
	{
		System.out.println("Sum of given numbers is "+Addition.add(11,123));  
		System.out.println("Sum of given numbers is "+Addition.add(11,141,1881)); 
		System.out.println("Sum of given numbers is "+Addition.add(12,13,14, 0));

	}

}
