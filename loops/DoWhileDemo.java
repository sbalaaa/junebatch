
public class DoWhileDemo {

	public static void main(String[] args) {
		String[] fruits =  { "Apple","Banana", "Orange"};
		
		//i<=fruits.length-1
		//i<fruits.length
		
		
		 /*for(int i=0;i<=fruits.length-1;i++) {
			
			 System.out.println("Fruit name is " + fruits[i]);
			
		 }
		 */
		
		/*int i=0;
		 while(i<=fruits.length-1) {
			 System.out.println("Fruit name is " + fruits[i]);
			 
			 i++;
		 }
		 */
		 int i=0;
		 do {
			 System.out.println("Fruit name is " + fruits[i]);
			 i++;
		 } while(i<=fruits.length-1);
		 
		 System.out.println("Loop End " );


	}

}
