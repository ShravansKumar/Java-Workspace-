package com;

class Employee {
	Employee(int id)
	{
		this(22,"Tom");
		System.out.println("Id:"+id);

	}
	Employee(int age,String name){
		System.out.println("Age:"+age + " " +"Name:" +name);
	}
	Employee(double salary)
	{
		this(100);
		System.out.println("Salary :"+ salary);

	}

	public static void main(String[] args) {
		Employee e= new Employee( 2.8);



	}


}
