package linkedlist;


import java.util.LinkedList;

import collection.TrainDTO;

public class Traindaolinkedlist {

	LinkedList details = new LinkedList();
	
	public String save (Traindtolinkedlist dto) {
		details.add(dto);
		return dto.getName()+"saved data";
		
	}
	public LinkedList getByName(String name) {
		LinkedList al = new LinkedList();
		for (int i=0; i<details.size(); i++) {
			Traindtolinkedlist dto= (Traindtolinkedlist)details.get(i);
			if (dto.getname().equals(name)) {
				al.add(dto);
			}
		}
		return al;
	}
	
	public LinkedList removeByName(String name) {
		LinkedList ar = new LinkedList();
		for (int i=0; i<details.size(); i++) {
			Traindtolinkedlist dto= (Traindtolinkedlist)details.get(i);
			if (dto.getname().equals(name)) {
				details.remove(dto);
			}
		}
		return ar;
	}	
	public LinkedList getByorigin(String origin) {
		for (int i=0; i<details.size(); i++) {
			Traindtolinkedlist dto= (Traindtolinkedlist)details.get(i);
			if (dto.getorigin().equals(origin)) {
				details.add(dto);
			}
		}
		return details;
	}
	public LinkedList getAll() {
		return details;
	}

}

