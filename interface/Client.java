
public class Client implements Callback, Welcome{

	@Override
	public void callback(int param) {
		System.out.println("Client implemenation " + param);
		
	}

	@Override
	public void show() {
		System.out.println("Client implemenation of show");
		
	}

}
