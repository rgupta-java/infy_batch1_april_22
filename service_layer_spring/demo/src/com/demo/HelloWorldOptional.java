package com.demo;

import java.util.Optional;

public class HelloWorldOptional {

	public static void main(String[] args) {
		String name=null;
		Optional<String> nameOpt=Optional.ofNullable(name);
		
		//java 8: stream programming???? funcational programming
		
		//System.out.println(nameOpt.orElse("name is found"));
		
		nameOpt.orElseThrow(()->
		new EmpNotFoundEx("emp with name "+ name +"is not found"));
	}
}
