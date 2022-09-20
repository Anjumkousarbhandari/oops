package com.qac.java.oop.inheritance;

public class Lion extends Animal{

	private String color;
	private String noOfEyes;
	
	public Lion() {
		System.out.println("Invoking Lion constructor");
	}	
		public String getcolor() {
			return color;
		}
		public void setcolor(String color) {
			this.color = color;
		}
		public String getnoOfEyes() {
			return noOfEyes;
		}
		public void setnoOfEyes(String noOfEyes) {
			this.noOfEyes = noOfEyes;
		}
}



