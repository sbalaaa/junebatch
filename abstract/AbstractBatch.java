
public abstract class AbstractBatch {
	
	public abstract void preProcess();
	
	public abstract void postProcess();
	
	public void process() {
		System.out.println("I am processing");
	}
	
	public  int add(int a, int b) {
		return a + b;					// implementation or method body
	}

}



//public int add(int a, int b) => Method declaration