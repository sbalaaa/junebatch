
public class Student {
	
	int studentId; // instance variable
	String firstName;
	String lastName;
	static String SCHOOL_NAME = "GOVERMENT SCHOOL , TRICHY"; // static or class variable
	
	
	Student() {
		System.out.println("constuctor is called");
		studentId = 100;
		firstName = "No name";
		lastName = "No last name";
	}
	
	/*Student(int id, String fn, String ln) {
		System.out.println("constuctor is called with 3 arguments");
		this.studentId = id;
		this.firstName = fn;
		this.lastName = ln;
	}
	*/
	
	Student(int studentId, String firstName, String lastName) {
		System.out.println("constuctor is called with 3 arguments");
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	Student(int studentId) {
		System.out.println("constuctor is called with 1 arguments");
		this.studentId = studentId;
	}
	
	
	
	
	void studying() {  	// instance method				
		int count = 0; // local variable
		System.out.println(firstName + " is studying");
		System.out.println(studentId + " is ID");
	}
	
	void walking() {  	// instance method				
		System.out.println(firstName + " is walking");
		System.out.println(studentId + " is ID");
		System.out.println(SCHOOL_NAME);
	}
	
	
	static String schoolName() {  // static method or class method
		//System.out.println(firstName + " is studying");
		//System.out.println(studentId + " is ID");
		return SCHOOL_NAME;
	}

}
