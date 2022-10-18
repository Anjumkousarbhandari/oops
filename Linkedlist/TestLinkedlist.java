package linkedlist;

import java.util.LinkedList;

public class TestLinkedlist {
	
	public static void main(String[] args) {
		
		Traindaolinkedlist train = new Traindaolinkedlist();
		
		Traindtolinkedlist dto = new Traindtolinkedlist();
		dto.setname("Mumbai Express");
		dto.setorigin("Mumbai");
		dto.setdestination("Chennai");
		dto.setspeed("110km/h");
		dto.set("isTicketBooking");
		train.save(dto);
		
			
		Traindtolinkedlist d = new Traindtolinkedlist();
		d.setname("Rajdhani Express");
		d.setorigin("Banglore");
		d.setdestination("Hyderabad");
		d.setspeed("100km/h");
		d.set("isExpress");
		train.save(d);
		
		Traindtolinkedlist dt = new Traindtolinkedlist();
		dt.setname("Karnataka Express");
		dt.setorigin("Dehli");
		dt.setdestination("Bangalore");
		dt.setspeed("130km/h");
		dt.set("isSafe");
		train.save(dt);
		
		
		LinkedList link= train.getByName("Mumbai Express");
		System.out.println(link);
		
		LinkedList l = train.getAll();
		System.out.println(l);
		
		LinkedList list = train.getByorigin("Mumbai");
		System.out.println(list);
		}

	}


