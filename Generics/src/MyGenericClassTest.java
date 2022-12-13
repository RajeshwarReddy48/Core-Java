
public class MyGenericClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyGenericClass<Integer> m1=new MyGenericClass<Integer>();
		m1.setObject(1248);
		Integer i=m1.getObject();
		System.out.println(i);
		
		MyGenericClass<String> m2=new MyGenericClass<String>();
		m2.setObject("Rajeshwar");
		String s=m2.getObject();
		System.out.println(s);
		
		MyGenericClass<Double> m3=new MyGenericClass<Double>();
		m3.setObject(4.0);
		Double d=m3.getObject();
		System.out.println(d);
		
		

	}

}
