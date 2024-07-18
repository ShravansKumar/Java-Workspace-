package mapexamples;

import java.util.Set;
import java.util.TreeMap;

class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1=new Employee(100);
		Employee e2=new Employee(145);
		Employee e3=new Employee(170);


		TreeMap<Employee,String>m=new TreeMap<Employee,String>();

		m.put(e1, "Jack");
		m.put(e2, "James");
		m.put(e3, "Alen");


		Set <Employee>keys=m.keySet();

		for(Employee key:keys) {
			System.out.println("Employee id of "+m.get(key)+" is " + key);
		}


	}
}
