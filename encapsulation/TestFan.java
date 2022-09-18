package com.qac.java;



public class TestFan {
	public static void main(String[]args){
		Fan fan = new Fan ();
		fan.setbrandName("Luminous");
		fan.setmodelName("Outlander");
		fan.setprice(2850);
		fan.setcolor('B');
		fan.settype("ceiling fan");
		fan.setnoOfBlades(3);
		

		System.out.println(fan.getbrandName());
		System.out.println(fan.getmodelName());
		System.out.println(fan.getprice());
		System.out.println(fan.getcolor());
		System.out.println(fan.gettype());
		System.out.println(fan.getnoOfBlades());
	}
}

