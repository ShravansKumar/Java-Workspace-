package com;

public class Car {

	static String brand="Bmw";
	static double cost=3.4;

	static void start() {
		System.out.println("Car Started");
	}
	public static void main(String[] args) {
		System.out.println("brand"+Car.brand+"cost"+Car.cost);
		Car.start();



	}

}
