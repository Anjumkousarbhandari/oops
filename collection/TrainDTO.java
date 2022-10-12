package collection;

import java.util.ArrayList;


public class TrainDTO {
	
		private String name;
		private String origin;
		private String destination;
		private	String speed;
		private boolean isTicketBooking;
		
		public TrainDTO() {
			System.out.println("Invoking TrainDTO class constructor");
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
	public String getName() {
		return null;
	}
	public void setorigin(String string) {
		
	}	public String toString() {
			return "[Name: "+name+"\t Origin: "+origin+"\t Destination: "+destination+"\t Speed: "+speed+"\t]";
		
	}	
	
		
}

