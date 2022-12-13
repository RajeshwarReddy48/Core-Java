class Animal1
{  
void eat()
{
	System.out.println("the animal is eating...");
	}  
}  
class Dog1 extends Animal1
{  
void bark()
{
	System.out.println("The dog is barking...");
	}  
}  
class BabyDog extends Dog1
{  
void weep()
{
	System.out.println("The babydog is weeping...");
	}  
}  
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();  

	}

}
