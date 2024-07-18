package sortingobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortEmployeeByList {
	public static void main(String[] args) {
		Employee e1=new Employee(11);
		Employee e2=new Employee(17);
		Employee e3=new Employee(15);

		ArrayList <Employee> l=new ArrayList<Employee>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		Collections.sort( l); //sort() uses compareTo()for sorting .
		for(Employee e :l) {
			System.out.println(e);
		}

	}

}
