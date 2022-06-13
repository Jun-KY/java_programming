package com.sumoon.api;

public abstract class Ship {
	
	String shipName;
	int fuelTank;
	
	public abstract void sail (int dist);
	public abstract void refuel (int fuel);
	public Ship() {
		shipName = "";
		fuelTank = 0;
	}
	public Ship(String shipName, int fuelTank) {
		this.shipName = shipName;
		this.fuelTank = fuelTank;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public int getFuelTank() {
		return fuelTank;
	}
	public void setFuelTank(int fuelTank) {
		this.fuelTank = fuelTank;
	}

	@Override
	public String toString() {
		return "\t" + shipName + "\t\t" + fuelTank;
	}
	
}
