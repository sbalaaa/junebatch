
public class ArrayDemo {

	public static void main(String[] args) {
		// 10, 20,30, 40
		int[] i = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50;
		
		System.out.println("first Element in an array is " + i[0]);
		
		//int lastElement  = i[3];
		int lastElement  = i[i.length - 1];
		System.out.println("Last Element in an array is " + lastElement);
		
		int length = i.length;
		System.out.println("Array size is " + length);
		
		
		int[] k = {10,20,30,50,60,70};
		System.out.println("Array size is " + k.length);
		System.out.println("Element in an Array  is " + k[2]);
		System.out.println("Last Element in an Array  is " + k[k.length-1]);
		
		
		/*String[] fruits = new String[3];
		fruits[0] = "Apple";
		fruits[1] = "Banana";
		fruits[2] = "Orange";*/
		
		String[] fruits =  { "Apple","Banana", "Orange"};
		
		Student[] students = new Student[3];
		System.out.println("First Student " + students[2] );
				

	}

}

// index = position
// lastIndex = array size - 1