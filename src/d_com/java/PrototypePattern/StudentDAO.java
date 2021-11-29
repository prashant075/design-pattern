package d_com.java.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements Cloneable {
	
	private static List<Student> studentList;
	static {
		studentList = new ArrayList<>();
		
		Student s1 = new Student();
		s1.setId(10);
		s1.setName("PK");
		
		Student s2 = new Student();
		s2.setId(10);
		s2.setName("PK");
		
		studentList.add(s1);
		studentList.add(s2);
	}
	
	public List<Student> getAllStudents(){
		return studentList;
	}

	@Override
	public  List<Student> clone() throws CloneNotSupportedException {
		
		List<Student> dummyList = new ArrayList<>();
		
		for(Student s: studentList) {
			dummyList.add(s);
		}
		return dummyList;
	}
	
	
}
