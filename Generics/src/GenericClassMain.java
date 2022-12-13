import java.util.ArrayList;
import java.util.List;

public class GenericClassMain {

	public static void main(String[] args) {
				
		GenericClass<Integer> gc1=new GenericClass<>();
		
		List<Integer> l1=new ArrayList<>();
		l1.add(1248);
		l1.add(12490);	
		l1.add(34);
		
		gc1.setList(l1);
		
		List<Integer> list1=gc1.getList();
		list1.forEach(System.out:: println);
		System.out.println("----------------------------------------");
		

		GenericClass<String> gc2=new GenericClass<>();
		
		List<String> l2=new ArrayList<>();
		l2.add("Rajeshwar");
		l2.add("Strings");	
		l2.add("Generics");
		
		gc2.setList(l2);
		
		List<String> list2=gc2.getList();
		list2.forEach(System.out:: println);
		System.out.println("----------------------------------------");
		

		
		
		GenericClass2<Integer, String> gc3= new GenericClass2<Integer, String>(1248,"Rajeshwar");
		System.out.println(gc3.getKey()+"\t"+gc3.getValue());
		
		GenericClass2<String, Integer> gc4= new GenericClass2<String, Integer>("Rajeshwar", 1248);
		System.out.println(gc4.getValue()+"\t"+gc4.getKey());
		
		
		
		
		

	}

}
