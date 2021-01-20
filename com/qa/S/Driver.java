package com.qa.S;

public class Driver {

	private int milesDriven;
	
	public void setMiles(int milesDriven) {
		this.milesDriven=milesDriven;
	}
	
	public void drive(Car car) {
		car.setMileage(car.getMileage()+milesDriven);
	}
	
	public void roundTrip(Car car) {
		car.setMileage(car.getMileage()+(milesDriven*2));
	}
}
