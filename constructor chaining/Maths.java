package com.QACiecle.corejava;

public class Maths {

	Maths(){
		this(5);
		System.out.println("The default constructor");
	}
		Maths (int x){
			this(5, 15);
			System.out.println (x);
		}
	Maths (int x, int y){
		System.out.println(x*y);
	}
	public static void main (String[]args) {
		Maths m =new Maths();
	}
}
