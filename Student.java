package assignment_3;

public class Student implements Comparable<Student>
{
	private String	firstName, lastName;
	private Double gpa;
	
	public Student(String firstName, String lastName, double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
	}

	public Double getGpa() {
		return gpa;
	}
	

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	public String toString() {
		return (firstName + " " + lastName + " has a "+ gpa.toString() + " gpa");
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int compareTo(Student inStudent) {
		return this.gpa.compareTo(inStudent.gpa);
	}
}
