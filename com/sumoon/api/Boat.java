package com.sumoon.api;

public class Boat extends Ship{
	
	public Boat() {
		
	}
	public Boat(String shipName, int fuelTank) {
		this.shipName = shipName;
		this.fuelTank = fuelTank;
	}
	@Override
	public void sail(int dist) {
		int temp = this.getFuelTank();
		int spendOil = dist *10;
		if (temp >= spendOil) {
			temp = temp - spendOil;
			this.setFuelTank(temp);
		}
		else {
			System.out.println("Not enough Oil");
		}
	}
	@Override
	public void refuel(int fuel) {
		int temp = this.getFuelTank();
		int fuelOil = fuel* 10;
		temp = temp + fuelOil;
		this.setFuelTank(temp);
	}

}
