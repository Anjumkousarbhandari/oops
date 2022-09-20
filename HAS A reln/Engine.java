package com.qac.java.oop.inheritance;

public class Engine {

	private String brandName;
	private byte noOfStrokes;
	private short capacity;
	
	public Engine () {
			System.out.println("provide Engine constructor");
	}
	public String getbrandName() {
		return brandName;
	}
	public void setbrandName(String brandName) {
		this.brandName = brandName;
	}
	public byte getnoOfStrokes() {
		return noOfStrokes;
	}
	public void setnoOfStrokes(byte  noOfStrokes) {
		this. noOfStrokes = noOfStrokes;
	}
	public short getcapacity() {
		return capacity;
	}
	public void setcapacity(short capacity) {
		this.capacity = capacity;
	}
}





