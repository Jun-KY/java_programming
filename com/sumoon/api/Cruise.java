package com.sumoon.api;

public class Cruise extends Ship{

	public Cruise() {

	}
	public Cruise(String shipName, int fuelTank) {
		this.shipName = shipName;
		this.fuelTank = fuelTank;
	}
	@Override
	public void sail(int dist) {
		int temp = this.getFuelTank();
		int spendOil = dist *13;
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
		int fuelOil = fuel* 8;
		temp = temp + fuelOil;
		this.setFuelTank(temp);
	}

}
