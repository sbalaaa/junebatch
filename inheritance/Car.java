
public class Car extends Vechile{
//public class Car {
	
	
	
	int noPassengerSheet = 0;
	
	Car() {
		
	}
	
	
	void printCarInfo() {
		System.out.println("No of Passenger Sheet: " + noPassengerSheet);
		System.out.println("No of Tyres: " + noOfTyres); // Inherited.
		System.out.println("Brand: " + brand); // Inherited.
	}
	
	
	public void drive() {
		System.out.println("We can drive this car ");
	}

}
