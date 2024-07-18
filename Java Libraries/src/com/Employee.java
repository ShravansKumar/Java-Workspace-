package com;

class Employee {
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee id of  " +name+" is "+id;    //we can also use this.id and this.name.

	}
	public static void main(String[] args) {
		Employee emp=new Employee(100,"Tom");
		Employee emp1=new Employee(200,"John");
		System.out.println(emp);
		System.out.println(emp1.toString());

	}
}
