package com;

class Employee {

	String name="Tom";

	Laptop laptop=new Laptop();

}

class Laptop{
	String brand ="HP";

}

class Solution{
	public static void main(String[] args) {
		Employee employee=new Employee();
		System.out.println("Name :"+employee.name);
		System.out.println("Brand : +employee.laptop.brand");
	}
}
