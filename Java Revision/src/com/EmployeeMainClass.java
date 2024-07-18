package com;

class EmployeeMainClass {
	static void findHighestSalary(Employee e1,Employee e2)
	{
		if(e1.sal>e2.sal) {
			System.out.println(e1.sal +"has the highest Salary");

		}
		else if(e1.sal<e2.sal) {
			System.out.println(e2.sal+"has lowest Salary");
		}
		else {
			System.out.println("Both have the same salary");
		}
	}
	public static void main(String[] args) {
		Employee e1=new Employee("Sagar",300.00);
		Employee e2=new Employee("Vivek",25.50);
		findHighestSalary(e1,e2);
		findHighestSalary(new Employee("Sagar",300.00),new Employee("Vivek",25.50));
	}


}
