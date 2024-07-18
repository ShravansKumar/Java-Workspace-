package org;

class Employee {
	int id;
	String name;
	double sal;


	Employee(int id ){
		this.id=id;
	}
	Employee(int id ,String name){
		this(id);
		this.name=name;

	}
	Employee(int id ,String name,double sal){
		this(id,name);

		this.sal=sal;



	}
	public static void main(String[] args) {
		Employee emp =new Employee(100,"Tom",3.7);
		System.out.println("Id :"+emp.id);
		System.out.println("Name :" +emp.name);
		System.out.println("Salary :"+ emp.sal);

	}
}
