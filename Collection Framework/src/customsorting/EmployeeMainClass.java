package customsorting;

import java.util.TreeSet;

public class EmployeeMainClass {

	public static void main(String[] args) {
		Employee e1=new Employee(165,"Jack");
		Employee e2=new Employee(181,"Jones");
		Employee e3=new Employee(195,"Alen");

		TreeSet <Employee>t=new TreeSet<Employee>(new SortEmployeeByName());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		for(Employee emp :t) {
			System.out.println(emp);
		}

	}

}
