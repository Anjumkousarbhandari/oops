class Fruit{	

	String name;
	int price;
	byte calories;
	String protein;
	
	public Fruit() {
		this(100);
		System.out.println ("Invoking Default constructor");
	}
	public Fruit(int price) {
		System.out.println("Invoking int constructor");
	}
	
	public Fruit(byte calories) {
		System.out.println("Invoking byte constructor");
	}

	public Fruit(String name) {
		System.out.println("Invoking String constructor");
	}

	public static void main (String[]args){
		Fruit f = new Fruit();
	}
}