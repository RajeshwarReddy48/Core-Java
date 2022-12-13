package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher sudheer=new Teacher(1232,"Sudheer",30000);
		Teacher namrata=new Teacher(1260,"Namrata",15000);
		Teacher anand=new Teacher(1254,"Anand babu",20000);
		
		List<Teacher> teacherList= new ArrayList<>();
		teacherList.add(sudheer);
		teacherList.add(namrata);
		teacherList.add(anand);
		
		Student rajeshwar=new Student(1248,"Rajeshwar",2);
		Student nishanth=new Student(1235,"Nishanth",3);
		Student rajeshekar=new Student(1210,"Rajeshekar",2);
		
		List<Student> studentList= new ArrayList<>();
		studentList.add(rajeshwar);
		studentList.add(nishanth);
		studentList.add(rajeshekar);
		
		School zphs=new School(teacherList,studentList);
		rajeshwar.payFees(25000);
		nishanth.payFees(10000);
		System.out.println("ZPHS has earned total amount: "+ zphs.getTotalMoneyEarned());
		
		//rajeshwar.payFees(25000);
		
		sudheer.receivedSalary(sudheer.getSalary());
		System.out.println("ZPHS has spent for  salary to "+sudheer.getName()+" and now has reamining amount : "+zphs.getTotalMoneyEarned());
		
		System.out.println(rajeshwar);
		System.out.println(sudheer);
		

	}

}
