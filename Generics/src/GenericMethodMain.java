
public class GenericMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {12,28,23,36,45};
		GenericMethod<Integer> gm= new GenericMethod<>(arr);
		Integer arr2[]= gm.getArr();
		gm.printElements(arr2);
		
		String str[]= {"Rajeshwar","Generics Training"};
		GenericMethod<String> gm2= new GenericMethod<>(str);
		String str2[]= gm2.getArr();
		gm2.printElements(str2);
		
		

	}

}
