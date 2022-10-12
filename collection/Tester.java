package collection;

import java.util.ArrayList;

public class Tester {
	
	public static void main(String[]args) {
		
	TrainDAO train = new TrainDAO();
		
	TrainDTO dto = new TrainDTO();
	dto.setname("Mumbai Express");
	dto.setorigin("Mumbai");
	dto.setdestination("Chennai");
	dto.setspeed("110km/h");
	dto.set("isTicketBooking");
	train.save(dto);
	
		
	TrainDTO d = new TrainDTO();
	d.setname("Rajdhani Express");
	d.setorigin("Banglore");
	d.setdestination("Hyderabad");
	d.setspeed("100km/h");
	d.set("isExpress");
	train.save(d);
	
	TrainDTO dt = new TrainDTO();
	dt.setname("Karnataka Express");
	dt.setorigin("Dehli");
	dt.setdestination("Bangalore");
	dt.setspeed("130km/h");
	dt.set("isSafe");
	train.save(dt);
	
	
	ArrayList arraylist = train.getByName("Mumbai Express");
	System.out.println(arraylist);
	
	ArrayList ar = train.getAll();
	System.out.println(ar);
	
	ArrayList list = train.getByorigin(null);
	System.out.println(list);
	}

}
