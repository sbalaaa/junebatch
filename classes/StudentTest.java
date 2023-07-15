
public class StudentTest {

	public static void main(String[] args) {
		
		Student ravi = new Student();
		ravi.studentId=1;
		ravi.firstName="Ravi";
		ravi.lastName = "Sekar";
		ravi.studying();
		
		Student ramu = new Student();
		ramu.studentId=2;
		ramu.firstName="Ramu";
		ramu.lastName = "Senthil";
		ramu.studying();
		
		Student temp = new Student();
		temp.studying();
		
		
		String name = Student.SCHOOL_NAME;
		System.out.println(Student.SCHOOL_NAME);
		
		System.out.println(Student.schoolName());

	}

}
