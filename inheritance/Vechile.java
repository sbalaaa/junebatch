public class Vechile {

	
	String color="";  // Red, White, Blue, Yello
	int maxSpeed;  // 50, 100, 200
	String brand="";  // Ford, Toyata, Maruthi, TVS
	int noOfTyres; // 4, 6
    int vehicleNo;
	
	static int counter; // No of Vehicle objects created
	
	Vechile() {
		//System.out.println("Vechile constructor is called.");
	}
	
	Vechile(String color, int maxSpeed, String brand, int noOfTyres, int vehicleNo) {
		this();
		//System.out.println("Vechile constructor with five parameter is called.");
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.brand = brand;
		this.noOfTyres = noOfTyres;
		this.vehicleNo = vehicleNo;
	}
	
	public void drive() {
		System.out.println("We can drive this vehicle ");
	}
	
	// Static methods
	public static void getNoOfVehicles() {
		System.out.println("Number of Vehicles: " + counter);
	}
	
}
