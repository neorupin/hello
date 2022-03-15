package com.okdev.tdd.hello;

public class Helloworld {
	public String getMessage() {
		return "Hello World"; 
	}

	public String getMessage(String name) {
		if (name == null) {
			name = "World";
		}
		return "Hello " + name;
	}

}
