
public class TestTwo {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		Vechile vechile = new Vechile();
		
		Truck truck = new Truck();

		vechile = myCar; // parent = child
		
		vechile = truck;
		
		
		myCar = vechile; // child = parent // not possible
		
		truck = vechile;
		
		
		myCar = truck; // un relattion classes
		
		truck = myCar;

	}

}
