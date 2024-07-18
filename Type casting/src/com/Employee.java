package com;

class Employee {
	String name="Jack";

}
class Developer extends Employee{
	void developApp() {
		System.out.println("Developing App !");

	}


}
class Tester extends Employee {
	void testApp() {
		System.out.println("Testing App !");
	}

	   
   }