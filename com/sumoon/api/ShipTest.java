package com.sumoon.api;

import java.util.HashMap;
import java.util.Scanner;

public class ShipTest {

	public static void main(String[] args) {
		HashMap<String, Object>map = new HashMap<String, Object>();
		Scanner sc = new Scanner(System.in);
		
		Boat Boat01 = new Boat();
		Boat01.setShipName("Boat01\t");
		Boat01.setFuelTank(500);
		map.put("1", Boat01);
		
		Cruise Cruise01 = new Cruise();
		Cruise01.setShipName("Cruise01");
		Cruise01.setFuelTank(1000);
		map.put("2", Cruise01);
		
		
		
		System.out.println("     ShipName\t\t    fuelTank");
		System.out.println("-----------------------------------------------");
		for(int i = 1; i<3; i++) {
			System.out.println(map.get(i+""));
		}
		System.out.print("\n����: ");int go = sc.nextInt();
		System.out.println(go+"����");
		
		for(int i = 1; i<3; i++) {
			((Ship)map.get(i+"")).sail(go);
		}
		System.out.println("     ShipName\t\t    fuelTank");
		System.out.println("-----------------------------------------------");
		for(int i = 1; i<3; i++) {
			System.out.println(map.get(i+""));
		}
		System.out.print("\n����: ");int gas = sc.nextInt();
		System.out.println(gas+"����");
		
		for(int i = 1; i<3; i++) {
			((Ship)map.get(i+"")).refuel(gas);
		}
		System.out.println("     ShipName\t\t    fuelTank");
		System.out.println("-----------------------------------------------");
		for(int i = 1; i<3; i++) {
			System.out.println(map.get(i+""));
		}
	}

}
