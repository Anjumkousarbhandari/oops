package com.qac.java;

public class Fan {
	private String brandName;
	private String modelName;
	private int price;
	private char color;
	private String type;
	private int noOfBlades;

	public Fan(){
		System.out.println("Fans will be ciculates air");
	}
	public String getbrandName(){
		return brandName;
	}
	public void setbrandName(String brandName){
		this.brandName = brandName;
	}
	public String getmodelName(){
		return modelName;
	}
	public void setmodelName(String modelName){
		this.modelName = modelName;
	}
	public int getprice(){
		return price;
	}
	public void setprice(int price){
		this.price = price;
	}
	public char getcolor(){
		return color;
	}
	public void setcolor(char color){
		this.color = color;
	}
	public String gettype(){
		return type;
	}
	public void settype(String type){
		this.type = type;
	}
	public int getnoOfBlades() {
		return noOfBlades;
	}
	public void setnoOfBlades(int noOfBlades) {
		this.noOfBlades = noOfBlades;
	}
		
}




