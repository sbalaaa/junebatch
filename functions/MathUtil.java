
public class MathUtil {
	
	static int count;
	
	int add(int a, int b) { // method declaration
		System.out.println(count);
		int result = a + b;
		return result;
	}  // method implemenation
	
	float add(float a, float b) {
		System.out.println(count);
		float resultAdd = a + b;
		return resultAdd;
	}
	
	int add(int a, int b, int c) {
		//System.out.println(resultAdd);
		System.out.println(count);
		int result = a + b + c;
		return result;
	}
	
	static void sayHello() {
		System.out.println(count);
		System.out.println("Hello");
	}
	
	 static String sayWelcome(String name) {
		System.out.println(count);
		 String result = "Hello " + name;
		return result;
	}

}
