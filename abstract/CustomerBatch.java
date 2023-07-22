
public  class CustomerBatch extends AbstractBatch{

	@Override
	public void preProcess() {
		System.out.println("CustomerBatch preProcess");
		
	}

	@Override
	public void postProcess() {
		System.out.println("CustomerBatch postProcess");
		
	}

}
