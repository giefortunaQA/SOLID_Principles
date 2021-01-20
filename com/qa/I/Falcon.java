package com.qa.I;

public class Falcon implements EggLayingCreature,FlyingCreature{
	 private String currentLocation;
	    private int numberOfEggs;

	    public Falcon(int initialEggCount) {
	        this.setNumberOfEggs(initialEggCount);
	    }

	    public String getCurrentLocation() {
	        return currentLocation;
	    }

	    public void setCurrentLocation(String currentLocation) {
	    this.currentLocation = currentLocation;
	    }

	    public int getNumberOfEggs() {
	        return numberOfEggs;
	    }

	    public void setNumberOfEggs(int numberOfEggs) {
	        this.numberOfEggs = numberOfEggs;
	    }
	
	@Override
	public void fly() {
		System.out.println("Weeeeeeeeeeee Im flying");
		
	}

	@Override
	public void layEggs() {
		System.out.println("I lay eggs too");
		
	}

}
