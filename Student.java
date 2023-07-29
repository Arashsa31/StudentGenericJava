package Labprogram409;

public class Student implements Comparable<Student> {

	private String firstName, lastName;
	private Double GPA;

	public Student(String first, String last, Double gradeAverage) {
		firstName = first;
		lastName = last;
		GPA = gradeAverage;
	}

	public int compareTo(Student otherStudent) {
		if (this.GPA.compareTo(otherStudent.GPA) > 0)
			return -1;
		if (this.GPA.compareTo(otherStudent.GPA) < 0)
			return 1;
		if (this.lastName.compareTo(otherStudent.lastName) < 0)
			return -1;
		if (this.lastName.compareTo(otherStudent.lastName) > 0)
			return 1;
		if (this.firstName.compareTo(otherStudent.firstName) < 0)
			return -1;
		if (this.firstName.compareTo(otherStudent.firstName) > 0)
			return 1;
		else
			return 0;
	}

	public String toString() {
		return String.format("%.2f", GPA) + " " + lastName + ", " + firstName;
	}
}
