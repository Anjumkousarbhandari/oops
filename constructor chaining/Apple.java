class Apple extends Fruit{
	String color;
	public Apple(){
		super(100);
	System.out.println("Invoking default constructor of Apple class");
	}

	public static void main(String[]args){
	Apple a = new Apple();
	}
}
