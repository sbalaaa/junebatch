package com.training;

public class TechnicalException extends Exception{
	
	public TechnicalException() {
		super();
	}
	
	public TechnicalException(String message) {
		super(message);
	}
	
	public TechnicalException(Throwable t,String message) {
		super(message,t);
	}

}
