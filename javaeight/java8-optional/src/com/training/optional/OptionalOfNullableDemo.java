package com.training.optional;

import java.util.Optional;

public class OptionalOfNullableDemo {

	public static void main(String[] args) {
		//String s = null;
		String s = "Hello";
		Optional<String> str = Optional.ofNullable(s);
		System.out.println(str);

	}

}
