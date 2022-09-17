package oops.encapsulation;

public class Laptop {
	private String brandName;
	private String modelName;
	private int price;
	private byte ram;
	private char color;

	public Laptop(){
		System.out.println("laptops are portable");
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
	public byte getram(){
		return ram;
	}
	public void setram(byte ram){
		this.ram = ram;
	}
	public char getcolor(){
		return color;
	}
	public void setcolor(char color){
		this.color = color;
	}
}

