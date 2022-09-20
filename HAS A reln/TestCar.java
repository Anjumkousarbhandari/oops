package com.qac.java.oop.inheritance;

public class TestCar {

		public static void main(String[]args) {
			Engine engine = new Engine();
			engine.setbrandName("Maruti");
			engine.setcapacity((short)350);
			engine.setnoOfStrokes((byte)4);
			
			Car car = new Car();
			car.setbrandName("Maruti");
			car.setmodelName("Celerio");
			car.setcolor('R');
			car.setfuelType("Diesel");
			car.setnoOfSteering((byte)1);
			car.setEngine(engine);
			
			
			
			System.out.println(car.getbrandName());
			System.out.println(car.getmodelName());
			System.out.println(car.getcolor());
			System.out.println(car.getfuelType());
			System.out.println(car.getnoOfSteering());
			System.out.println(car.getEngine());
			
			Engine carEng = car.getEngine();
			System.out.println(carEng.getbrandName());
			System.out.println(carEng.getcapacity());
			System.out.println(carEng.getnoOfStrokes());
		
			
		}
		
		
}