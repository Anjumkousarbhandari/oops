package com.QACiecle.corejava;

public class Multiplication extends Maths{
	
	public Multiplication() {
		super(5);
		System.out.println("Invoking default constructror of Multiplication class");
	}
	public static void main (String[]args) {
		Multiplication m = new Multiplication();
	}
}
