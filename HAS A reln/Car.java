package com.qac.java.oop.inheritance;

public class Car {
	private String brandName;
	private String modelName;
	private char color;
	private String fuelType;
	private byte noOfSteering;
	private Engine engine;
	
	public static void main (String[]args) {
		Engine engine = new Engine();
		engine.setbrandName ("Maruti");
		engine.setcapacity((short)350);
		engine.setnoOfStrokes((byte)4);
	}
	
	public String getbrandName() {
		return brandName;
	}
	
	public void setbrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public String getmodelName() {
		return modelName;	
	}
	public void setmodelName(String modelName) {
		this.modelName = modelName;
	}
	public char getcolor() {
		return color;
	}
	public void setcolor(char color) {
		this.color = color;
	}
	public String getfuelType() {
		return fuelType;
	}
	public void setfuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public byte getnoOfSteering() {
		return noOfSteering;
	}
	public void setnoOfSteering(byte noOfSteering) {
		this.noOfSteering = noOfSteering;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	
}

