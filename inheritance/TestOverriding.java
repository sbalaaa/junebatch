
public class TestOverriding {

	public static void main(String[] args) {
		
		/*Car myCar = new Car();
		myCar.drive();
		
		Vechile vechile = new Vechile();
		vechile.drive();
		
		Truck truck = new Truck();
		truck.drive();
		*/
		
		Vechile v = new Car();
		v.drive();
		//v.printCarInfo();
		
		v = new Truck();
		v.drive();

	}

}
