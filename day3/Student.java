
public class Student {
	
	int studentId; // instance variable
	String firstName;
	static int count = 0; // class or static variable
	
	{
		
	}
	
	Student() { // Consturctor 
		
	}
	
	void studying() {  // instance method 
		int k = 0;
		System.out.println(firstName + "  studying");
		System.out.println(studentId + "  id");
	}
	
	void writingExam() {
		System.out.println("writingExam");
	}
	
	static void studentsCount() {  // static or class method
		System.out.println("count is " + count);
	}

}
