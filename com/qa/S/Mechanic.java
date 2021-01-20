package com.qa.S;

public class Mechanic {
	private double bill;
	
	public void setBill(double bill) {
		this.bill=bill;
	}
	
	public double getBill() {
		return bill;
	}
	public void printBill() {
		System.out.println("Your total to pay is "+ getBill());
	}
}
