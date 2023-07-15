
public class StudentTestTwo {

	public static void main(String[] args) {
		
		Student ravi = new Student(1,"Ravi","Sekar");
		//ravi.studentId=1;
		//ravi.firstName="Ravi";
		//ravi.lastName = "Sekar";
		
		System.out.println(ravi.studentId);
		System.out.println(ravi.firstName);
		System.out.println(ravi.lastName);
		
		System.out.println("Ravi End \n \n");

		
		Student ramu = new Student(2,"Ramu","Senthil");
		//ramu.studentId=2;
		//ramu.firstName="Ramu";
		//ramu.lastName = "Senthil";
		
		System.out.println(ramu.studentId);
		System.out.println(ramu.firstName);
		System.out.println(ramu.lastName);
		
		System.out.println("Ramu End \n \n");

		
		Student temp = new Student(3);
		
		System.out.println(temp.studentId);
		System.out.println(temp.firstName);
		System.out.println(temp.lastName);

	

	}

}
