package com.qa.L;

public class Penthouse extends BedroomAddableApartment{
    public Penthouse() {
        this.setNumberOfBedrooms(4);
    }

    @Override
    public void setSquareFootage(int sqft) {
        this.setSquareFootage(this.getSquareFootage());
    }

	@Override
	public void addBedroom() {
		this.setNumberOfBedrooms(this.getNumberOfBedrooms()+1);
		this.setSquareFootage(this.getSquareFootage()+40);
	}
}