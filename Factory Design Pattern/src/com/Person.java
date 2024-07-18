package com;

import java.util.Scanner;

class Person {


	static Vehicle selectvehicle(int choice)
	{
		if (choice==1) {
			return new Car();

		}
		else if(choice==2) {
			return new Bike();

		}
		else {
			return null;

		}
	}
	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		System.out.println("1.Car\n 2.Bike\n Enter your Choice :");

		int choice =scan.nextInt();
		scan.close();

		Vehicle obj=selectvehicle( choice);

		if(obj instanceof Car) {
			System.out.println("Driving a car");
		}
		else if(obj instanceof Bike) {
			System.out.println("Riding a Bike");


		}
		else {
			System.out.println("Better walk loser");
		}
	}
}
