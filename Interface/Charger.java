package com.q.java;

public interface Charger {
	String type= "MobileCharger";
	int price= 500;
	 public void givesPower();
	 public default void highCapacity() {
	 System.out.println("Charger will be supply the powers to mobiles");
	 }

}
