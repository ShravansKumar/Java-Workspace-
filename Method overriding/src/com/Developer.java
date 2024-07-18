package com;

public class Developer extends Employee{
	@Override
	void work() {

		System.out.println("Developer is Developing an application");
		super.work();
	}
}
