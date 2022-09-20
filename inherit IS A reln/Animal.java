package com.qac.java.oop.inheritance;

public class Animal {
	
	private String name;
	private Short age;
	private String sound;
	
	public Animal() {
		System.out.println("Invoking Animal constructor");
	}
	public String name() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public short age() {
		return age;
	}
	public void setage(short age) {
		this.age = age;
	}
	public String sound() {
		return sound;
	}
	public void setsound(String sound) {
		this.sound = sound;
	}

}
