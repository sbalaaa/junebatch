
public class AbstractTest {

	public static void main(String[] args) {
		//AbstractBatch batch = new AbstractBatch();
		
		// Dynamic method dispatch
		 AbstractBatch batch;
		 
		 AccountBatch account = new AccountBatch();
		 CustomerBatch customer = new CustomerBatch();
		 
		// batch = account;
		 
		 batch = customer;
		 
		 batch.preProcess();
		 batch.process();
		 batch.postProcess();
		 
		 
		 batch = account;
		 
		 
		 batch.preProcess();
		 batch.process();
		 batch.postProcess();
		 
		

	}

}
