package com.Anjum.Spring.dto;

public class Qac {
	
	private int EmpId;
	private String EName;
	private String Adress;
	private String Email;
	
	public Qac() {
		System.out.println("Qac class constructor");
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEName() {
		return EName;
	}

	public void setEName(String eName) {
		EName = eName;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	

}
