
public class StudentEquals {

	public static void main(String[] args) {
		/*String s = "Hello";
		String anotherString = "Hello";
		
		if(s.equals(anotherString)) {
			System.out.println("Both are equal");
		}
		*/
		
		Student obj = new Student();
		obj.studentId = 1;
		obj.name = "Ravi";

		System.out.println(obj);
		
		Student anotherObject = new Student();
		anotherObject.studentId = 1;
		anotherObject.name = "Raja";
		System.out.println(anotherObject);
		
		if(obj.equals(anotherObject)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}
			
	}

}
