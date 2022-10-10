package com.circle.Arraylist.collection;

import java.util.ArrayList;

public class NameUsingArraylist {
	

		public static void main(String[]args) {
			ArrayList arraylist = new ArrayList();
		
			arraylist.add("Anjum");
			arraylist.add(6366057941l);
			arraylist.add(38);
			arraylist.add(5.0f);
			arraylist.add(1999);
			arraylist.add("February");
			
			
			System.out.println(arraylist.get(2));
			System.out.println(arraylist);
			arraylist.remove(3);
			System.out.println(arraylist.size());
			arraylist.clear();
			
		}

	}



