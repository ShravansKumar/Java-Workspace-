package defaultsorting;

import java.util.TreeSet;

class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1=new Employee(240,"John",4500);
		Employee e2=new Employee(245,"Ryan",2500);
		Employee e3=new Employee(257,"Stanley",5000);


		TreeSet<Employee> t=new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);

		for(Employee emp:t) {
			System.out.println(emp);
		}
	}

}
