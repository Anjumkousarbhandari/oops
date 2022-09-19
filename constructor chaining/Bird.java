package com.QACiecle.corejava;

public class Bird {

	int noOfEyes;;
	String color;
	
	public Bird() {
		this("Green");
		System.out.println("Invoking Default constructor");
	}
	public Bird(int noOfEyes) {
		this();
		System.out.println("invoking int constructor");
	}
	
	public Bird(String color) {
		System.out.println("Invoking String constructor");
	}
	public static void main(String[]args) {
		Bird b = new Bird();
	}
}
