class Animal2
{  
void eat()
{
	System.out.println("The animal is eating...");
	}  
}  
class Dog2 extends Animal2
{  
void bark()
{
	System.out.println("The dog is barking...");
	}  
}  
class Cat extends Animal2
{  
void meow()
{
	System.out.println("The cat is meowing...");
	}  
}  
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
		//c.bark(); error
		

	}

}
