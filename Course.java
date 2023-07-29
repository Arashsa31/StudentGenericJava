package Labprogram409;

public class Course implements Comparable<Course> {

	private String department;
	private Integer number;

	public Course(String dept, Integer num) {
		department = dept;
		number = num;
	}

	public int compareTo(Course otherCourse) {
		if (this.department.compareTo(otherCourse.department) > 0)
			return 1;
		if (this.department.compareTo(otherCourse.department) < 0)
			return -1;
		if (this.number.compareTo(otherCourse.number) > 0)
			return 1;
		if (this.number.compareTo(otherCourse.number) < 0)
			return -1;
		else
			return 0;
	}

	public String toString() {
		return department + " " + number;
	}

}
