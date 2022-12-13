import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Rajeshwar");
		list.add("Z");
		//list.add(new Integer(100));  stronger data type checks at compile time
		
		Iterator<String> itr= list.iterator();
		while(itr.hasNext())
		{
			String data=itr.next();// type casting is not required
			System.out.println("Output is:"+data);
		}
		
		
		

	}

}
