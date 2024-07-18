package com;

import java .util.Scanner;

class demo {
	public static void main(String[] args) {
		System.out.println("start");
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int x=scan.nextInt(); //int x=10;

		System.out.println("Enter the second number :");
		int y=scan.nextInt();
		scan.close();

		int sum=x+y;
		System.out.println("Sum of "+x +"  " +"and "+y +" " +"is" + sum);

		System.out.println("end");

	}
}
