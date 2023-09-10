package com.training.optional;

import java.util.Optional;

public class OptionalOfDemo {

	public static void main(String[] args) {
		String s = "Hello";
		Optional<String> str = Optional.of(s);
		System.out.println(str);

	}

}
