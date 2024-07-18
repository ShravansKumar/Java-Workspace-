package org;

class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1=new Employee(100,"tom");
		Employee e2=new Employee(100,"tom");

		System.out.println(e1.equals(e2)); 
		               //or
		System.out.println(e1.equals(new Employee(100,"Tom")));
		if(e1.equals(e2)) {
			System.out.println("Id & name are same");

		}
		else{
			System.out.println("Id & name are different");
		}
	}

}
