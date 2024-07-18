package com;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the number : ");
		int x=sc.nextInt();
		if(x%2==0)
			System.out.println("even no");

		if(x%2!=0)
			System.out.println("Odd no");

	}
}

