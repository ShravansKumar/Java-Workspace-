package sortingobjects;

import java.util.Collections;
import java.util.TreeSet;

class SortByEmployeeBySet {
public static void main(String[] args) {
	
	
		Employee e1=new Employee(11);
		Employee e2=new Employee(17);
		Employee e3=new Employee(15);
		
		TreeSet<Employee>t=new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		
		
		
		for(Employee e:t) {
			System.out.println(e);
		}
		
}
}