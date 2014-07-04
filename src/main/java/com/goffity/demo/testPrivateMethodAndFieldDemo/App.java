package com.goffity.demo.testPrivateMethodAndFieldDemo;

/**
 * Hello world!
 *
 */
public class App {

	private String privateField = "private_field";

	public static void main(String[] args) {

		App app = new App();

		System.out.println("privateField: " + app.privateField);
		
		System.out.println(app.privateMethod("Main"));;
	}

	private String privateMethod(String string) {
		System.out.println("privateMethod");

		return string;
	}
}
