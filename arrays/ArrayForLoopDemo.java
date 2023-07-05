
public class ArrayForLoopDemo {

	public static void main(String[] args) {
	
		
		String[] fruits =  { "Apple","Banana", "Orange"};
		
		System.out.println("Loop Started ");
		//enhanced for loop
		for(String fruit : fruits ) {
			System.out.println(fruit);
		}
				
		System.out.println("Loop Ended ");

	}

}

// index = position
// lastIndex = array size - 1