package assignment_3;

public class CourseDriver {
	public static void main(String[] args) {
		Course course1 = new Course("Science");
		Course course2 = new Course("Math");
		
		course1.addStudent(new Student("Mary", "Foster", 2.8));
		course1.addStudent(new Student("John", "Treter", 3.1));
		course1.addStudent(new Student("Marsha", "Olive", 4.9));
		
		course2.addStudent(new Student("Gaige", "Chester", 4.0));
		course2.addStudent(new Student("Antonio", "Aegend", 3.0));
		
		course1.studentRole("Science");
		course2.studentRole("Math");
		course1.average("Science");
		course2.average("Math");
	}
}
