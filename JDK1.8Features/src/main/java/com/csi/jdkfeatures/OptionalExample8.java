package com.csi.jdkfeatures;

import java.util.Optional;

public class OptionalExample8 {
	
	public static void main(String[] args) {
		
		String name = null;
		
		Optional<String> companyName = Optional.ofNullable(name);
		if(companyName.isPresent()) {
			System.out.println(name.length());
		}
		else {
			System.out.println("Company Name is Null");
		}
	}
}
