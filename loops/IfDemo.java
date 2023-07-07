
public class IfDemo {

	public static void main(String[] args) {
		int salary = 20000;
		// salary above 50000 good salary
		// salary above 25000 average salary
		
		if ( salary > 50000 ) {
			System.out.println("Person is getting good salary");
		} else if (salary > 25000) {
			System.out.println("Person is getting average salary");
		} else {
			System.out.println("Person is not getting good salary");
		}

	}

}
