package example;

class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1=new Employee(15,"Shravan");
		Employee e2=new Employee(12,"Aditya");	

		Employee[]emp= {e1,e2};
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]); //printing e1 and e2
		}                               //calls toString() internally


	}
}
