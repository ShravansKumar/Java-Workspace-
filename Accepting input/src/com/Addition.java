package com;

import java.util.Scanner;

public class Addition {
	static void add(int x,int y) {
		System.out.println("Sum"+x+" & " +y+ " is "+(x+y));
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter 2 numbers :");
			int x =scan.nextInt();
			int y=scan.nextInt();
			add(x,y);
			System.out.println("_____");

		}
		scan.close();
	} //add(10,20); -. hard coding

}
