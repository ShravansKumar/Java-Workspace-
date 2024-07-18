package com;
import java.util.Scanner;
class Employee {

	public static void main(String[] args) {
		System.out.println("Start");

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the id :");
		int id =scan.nextInt();
		System.out.println("Enter the name :");
		String name=scan.next();

		System.out.println("Salary of the employee :");
		double sal=scan.nextDouble();
		System.out.println("Gender of the employee is :");
		String gender=scan.next();

		System.out.println("-------");

		scan.close();
		System.out.println("Employee id"+id);
		System.out.println("Employee name"+name);
		System.out.println("Employee sal"+sal);
		System.out.println("Employee gender"+gender);




	}











}
