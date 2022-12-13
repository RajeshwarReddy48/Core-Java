
public class SwapingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="rajeshwar";
		String str2="reddy";
		
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println("After swaping first string :"+str1);
		System.out.println("After swaping second string :"+str2);


	}

}
