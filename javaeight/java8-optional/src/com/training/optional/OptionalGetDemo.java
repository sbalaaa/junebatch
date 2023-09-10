package com.training.optional;

import java.util.Optional;

public class OptionalGetDemo {

	public static void main(String[] args) {
		Optional<String> strContainer = Optional.of("Hello");
		//Optional<String> strContainer = Optional.ofNullable(null);
		//System.out.println(strContainer.get());
		
		if(strContainer.isPresent()) {
			System.out.println(strContainer.get());
		} else {
			System.out.println("optional has no valje");
		}

	}

}
