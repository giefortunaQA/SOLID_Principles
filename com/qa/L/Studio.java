package com.qa.L;

public class Studio extends NotBedroomAddableApartment{
    public Studio() {
        this.setNumberOfBedrooms(0);
    }

    @Override
    public void setSquareFootage(int sqft) {
        this.setSquareFootage(sqft);
    }

	@Override
	public void rearrangeFurniture() {
		System.out.println("Lalalala~ I'm rearranging the furniture");
		
	}
}
