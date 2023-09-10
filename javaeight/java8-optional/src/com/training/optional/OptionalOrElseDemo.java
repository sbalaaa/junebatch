package com.training.optional;

import java.util.Optional;

public class OptionalOrElseDemo {

	public static void main(String[] args) {
			Optional<String> strContainer = Optional.ofNullable(null);
		System.out.println(strContainer.orElse("TEST"));



	}

}
