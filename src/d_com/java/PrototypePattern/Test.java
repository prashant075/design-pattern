package d_com.java.PrototypePattern;

import java.util.List;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		StudentDAO studentDAO = new StudentDAO();
		
		List<Student> allStudent = studentDAO.getAllStudents();
		
		
		List<Student> updatedStudentList = studentDAO.clone();
		
		Student student = new Student();
		student.setId(30);
		student.setName("SK");
		
		updatedStudentList.add(student);
		
		System.out.println("Original List");
		allStudent.forEach(System.out::println);
		
		System.out.println("Updated List");
		updatedStudentList.forEach(System.out::println);
		
		
		
		
	}
}
