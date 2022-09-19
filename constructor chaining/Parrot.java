package com.QACiecle.corejava;

public class Parrot extends Bird{

	String type;
	public Parrot() {
		super("Green");
		System.out.println("Invoking default constructor of parrot class");
	}
	public Parrot(String type) {
		this();
	}
	public static void main(String[]args) {
		Parrot p = new Parrot();	
		}
}
