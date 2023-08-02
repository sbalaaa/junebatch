package com.training;

public class ClientErrorException extends RuntimeException{
	
	public ClientErrorException() {
		super();
	}
	
	public ClientErrorException(String message) {
		super(message);
	}
	
	public ClientErrorException(Throwable t,String message) {
		super(message,t);
	}

}
