
public class TestInterface {

	public static void main(String[] args) {
		//Callback c = new Callback();
		Callback c;
		Client client = new Client();
		
		c = client;
		c.callback(10);
		
		AnotherClient ac = new AnotherClient();
		c = ac;
		c.callback(10);
		
		System.out.println(Callback.count);

	}

}
