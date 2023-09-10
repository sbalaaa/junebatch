package com.training.optional;

import java.util.Optional;

public class StringUtil {

	public String giveUpperCase( String arg) {
		return arg.toUpperCase();
		//return null;
	}
	
	
	public Optional<String> giveUpperCaseWithOptional( String arg) {
		return Optional.of(arg.toUpperCase());
		//return  Optional.ofNullable(null);
	}
	
}
