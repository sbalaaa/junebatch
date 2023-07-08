
public class PrimeNumber {

	public static void main(String[] args) {
		 

		 int number = 4;
	
		 int flag = 0;
		 for(int i=2;i<number/2;i++) {
			 if(number%i==0) {
				 flag = 1;
			 }
		 }
		 

		 
		 if(flag == 1) {
			 System.out.println("Number is not prime number");
		 } else {
			 System.out.println("Number is prime number");
		 }


	}

}


	
