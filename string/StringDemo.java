
public class StringDemo {

	public static void main(String[] args) {
		
		String s = new String("Hello");
		
		String aString = "Hi";
		
		
		String anotherString = s + aString;
		//System.out.println("Concaternation reulst is : " + anotherString);
		
		String joinResult = s.concat(aString);
		//System.out.println("Concaternation reulst is : " + joinResult);
		
		int len = s.length();
		//System.out.println("Length is " + len);
		
		String sub = s.substring(1);
		//String sub = s.substring(0, 3);
		//System.out.println("Substring is " + sub);
		
		String bString = "HI";
		
		//if(aString == bString) {
		//if(aString.equals(bString)) {
		if(aString.equalsIgnoreCase(bString)) {
			System.out.println("String are equal");
		} else {
			System.out.println("String are not equal");
		}
		
		char firstChar = s.charAt(0);
		//System.out.println(firstChar);
		
		//int index = s.indexOf('e');
		int index = s.lastIndexOf('l');
		//System.out.println(index);
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

	}

}
