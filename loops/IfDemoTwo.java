
public class IfDemoTwo {

	public static void main(String[] args) {
		int salary = 120000;
		// salary above 50000 good salary
		// salary above 25000 average salary
		
		if ( salary > 50000 ) {
			System.out.println("Person is getting good salary");
			
			if( salary > 100000 ) {
				System.out.println("Person is getting very good salary");
			}
			
		} else if (salary > 25000) {
			System.out.println("Person is getting average salary");
			//int k = 0;
			//System.out.println(k);
		} else {
			System.out.println("Person is not getting good salary");
			//System.out.println(k);
		}
		
		//System.out.println(k);

	}

}

// if inside another if = nested if 