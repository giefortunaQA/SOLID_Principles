package com.qa.S;

public class Runner {

	public static void main(String[] args) {
		Car igat=new Car("silver","micra",1000);
		Driver jay=new Driver();
		jay.setMiles(300);
		jay.drive(igat);
		System.out.println(igat.getMileage());
		jay.roundTrip(igat);
		System.out.println(igat.getMileage());
		
		Mechanic mech=new Mechanic();
		mech.setBill(23.99);
		mech.printBill();
	}

}
