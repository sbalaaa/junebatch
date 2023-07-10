
public class StringDemoTwo {

	public static void main(String[] args) {
		//String sentence = "I love my country";
		String sentence = "Apple,Orange,Banana";
		String[] words = sentence.split(",");
		
		for(String word:words) {
			//System.out.println("\n \n \n");
			System.out.print(word + "\t");
		}
		

	}

}
