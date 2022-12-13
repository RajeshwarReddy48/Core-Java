class Animal
{  
void eat()
{
	System.out.println("The animal is eating now...");
	}  
}  
class Dog extends Animal
{  
void bark()
{
	System.out.println("The dog is barking...");
	}  
}  

class Inheritance
{  
public static void main(String args[])
{  
Dog d=new Dog();  
d.bark();  
d.eat();  
}
}  