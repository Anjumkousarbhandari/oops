package collection;

import java.util.ArrayList;


public class Train {
	
		private String name;
		private String origin;
		private String destination;
		private	String speed;
		private boolean isTicketBooking;
		public static void main(String[]args) {
		
			ArrayList details = new ArrayList();
			details.add("Mumbai Express");
			details.add("Mumbai");
			details.add("Chennai");
			details.add("110km/h");
			details.add("isTicketBooking");
			System.out.println(details);
			details.remove(0);
			System.out.println(details);
			
			
		}
		public void save(Train details) {
			Train train;
			details.save(train);
		}
	
	public void getByName(String name, details) {
		for (int i=0; i<train.length; i++) {
			if(train.equals(details)) {
				return "name";
			}
		}
	}	
	public String getname() {
				return name;
			}
	public void setname(String name) {
			this.name=name;
		}	
	public String getorigin() {
			return origin;
}
	public void set(String origin) {
		this.origin=origin;
	}	
	public String getdestination() {
		return destination;
	}
	public void setdestination(String destination) {
	this.destination=destination;
	}	
	public String getspeed() {
		return speed;
	}
	public void setspeed(String speed) {
	this.speed=speed;
	}	
	public boolean getisTicketBooking() {
		return isTicketBooking;
	}
	public void setisTicketBooking(boolean isTicketBooking) {
	this.isTicketBooking=isTicketBooking;
}	
		Train train = new Train();
	
		
	}

