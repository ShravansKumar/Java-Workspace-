package com;

import java.util.Scanner;

class Amazon {
	static Electronics selectorder(int choice)

	{
		if(choice ==1) {
			return new Laptop();

		}
		else if(choice==2) {
			return new Mobile();

		}
		else if(choice ==3) {
			return new Headphone();
		}
		else {
			return null;

		}

	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice=scan.nextInt();
		scan.close();

		Electronics obj=selectorder(choice);
		if(obj instanceof Laptop) {
			System.out.println("Laptop results are shown");

		}
		else if(obj instanceof Mobile) {
			System.out.println("Mobile results are shown");

		}
		else if(obj instanceof Headphone) {
			System.out.println("Headphones results are shown");
		}
		else {
			System.out.println("No results to show (:");
		}
	}
}
