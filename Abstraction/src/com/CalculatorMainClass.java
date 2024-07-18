package com;

import java.util.Scanner;

class CalculatorMainClass {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Calculator cal=new  CalculatorImpl();

		System.out.println("1.Addition\n2.Substraction ");
		System.out.println("3.Multiplication \n4.Division");
		System.out.println("Enter your choices :");
		int choice=scan.nextInt();


		int a=0;
		int b =0;

		if(choice>=1&& choice<=4) {
			System.out.println("Enter 2 numbers:");
			a=scan.nextInt();
			b=scan.nextInt();

		}
		switch(choice) {
		case 1:
			cal.add(a,b);
			break;

		case 2:
			cal.sub(a,b);
			break;
		case 3:
			cal.mul(a,b);
			break;
		case 4:
			cal.div(a,b);
		default:
			System.out.println("invalid choice");


		}



	}
}


