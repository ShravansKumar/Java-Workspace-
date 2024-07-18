package com;

//Accessing public members in different class,same package
public class EmployeeMainClass {
	public static void main(String[] args) {
		System.out.println("Id :"+ Employee.id);

		Employee e=new Employee (); 

		System.out.println("Name :"+e.name);
		System.out.println("Salary:"+e.salary);



	}
}


