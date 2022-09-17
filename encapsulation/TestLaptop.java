package oops;

import oops.encapsulation.Laptop;

public class TestLaptop {
	public static void main(String[]args){
		Laptop laptop = new Laptop();
		laptop.setbrandName("Lenovo");
		laptop.setmodelName("Yoga 9i Gen 7");
		laptop.setprice(40000);
		laptop.setram((byte)16);
		laptop.setcolor('B');
		

		System.out.println(laptop.getbrandName());
		System.out.println(laptop.getmodelName());
		System.out.println(laptop.getprice());
		System.out.println(laptop.getram());
		System.out.println(laptop.getcolor());
}
}

