public class Truck extends Vechile {

	
	
	int cargoBay = 0;
	
	Truck() {
		//System.out.println("Truck constructor is called.");
	}
	
	void printTruckInfo() {
		System.out.println("Cargo Bay is: " + cargoBay);
		System.out.println("No of Tyres: " + noOfTyres); // Inherited.
		System.out.println("Brand: " + brand); // Inherited.
		getNoOfVehicles(); // Methods is inherited.
	}
	
	void load() {
		System.out.println("Load method is called.");	
	}
	
	void unLoad() {
		System.out.println("Unload method is called.");	
	}

	
	public static void main(String args[]){
		Truck obj = new Truck();
		obj.printTruckInfo();
		obj.load();
	}
	
	public void drive() {
		System.out.println("We can drive this truck ");
	}
	
}

