package com.training.optional;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		StringUtil obj = new StringUtil();
		String result = obj.giveUpperCase("hello");
		System.out.println(result.charAt(0));
		
		Optional<String> optionalStr = obj.giveUpperCaseWithOptional("hello");
		
		String optStr = optionalStr.get();
		
		System.out.println(optStr.charAt(0));


	}

}
