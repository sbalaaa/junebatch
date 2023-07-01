
/*
 * 
 * It is the sample program to call a method from another class
 * 
 * 
 */

public class StudentTest {

	public static void main(String[] args) {
		
		// Creating object for student class
		Student ravi = new Student();
		ravi.studentId = 1;
		ravi.firstName = "Ravikumar";
		ravi.studying();
		
		System.out.println("\n \n");
		
		Student ramu = new Student();
		ramu.studentId = 2;
		ramu.firstName = "Ram kumar";
		ramu.studying();
		
		System.out.println("\n \n");
		
		int count = Student.count;
		System.out.println(count);
		
		Student.studentsCount();

	}

}
