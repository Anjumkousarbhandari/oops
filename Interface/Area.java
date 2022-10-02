package com.q.java;

import java.util.Scanner;

public class Area implements Measurements{

	public void dimensions() {
	
	int length, breadth;
	Scanner scanner = new Scanner(System.in);
	System.out.print(5);
	length=scanner.nextInt();
	System.out.print(5);
	breadth=scanner.nextInt();
	
	
	String dimensions = "length*breadth";
	System.out.println("dimensions:"+dimensions);
		
	}

	@Override
	public void sizes() {
		
		
	}
	
}


