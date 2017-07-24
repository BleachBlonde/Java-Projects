package assignment_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Course implements Iterable<Student> {
	private ArrayList<Student> students;
	double averageGPA, totalGPA;
	int totalStudents;
	
	public Course(String courseName) {
		students = new ArrayList<Student>();
	}

	public void addStudent(Student s) {
		students.add(s);
	}
	
	public void studentRole(String courseName) {
		System.out.println("Students in your " + courseName + " course\n-----------------------------");
		for (Student Student : students) {
			System.out.println(Student.getFirstName());
		}
		System.out.println();
	}
	
	public void average(String courseName) {
		totalGPA = 0;
		totalStudents = 0;
		averageGPA = 0;
		
		for (Student Student : students) {
			totalGPA += Student.getGpa();
			totalStudents+=1;
		}
		
		averageGPA = totalGPA/totalStudents;
		System.out.println("The average gpa is of " + courseName + " is: " + averageGPA);
	}
	
	@Override
	public Iterator<Student> iterator() {
		return students.iterator() ;
	}
}
