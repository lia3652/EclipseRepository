package ust.com.lambdasample;

import java.util.Optional;

public class Optionals {
	
	public static void main(String[] args) {

	    Optional<String> optionalWithValue = Optional.of("Hello, World!");

	    Optional<String> optionalWithNull = Optional.ofNullable(null);

	    optionalWithValue.ifPresent(value -> System.out.println("Value present: " + value));

	    String result = optionalWithNull.orElse("Default Value");
	    System.out.println("Result from emptyOptional: " + result);


	}
	
	
	/*
	 //non -optional
	 
	-remove modifier
	-remove return type
	-remove method Name
	-add arrow
	 
	//optional
	-remove return 
	-use type interface
	 
	*/

}
