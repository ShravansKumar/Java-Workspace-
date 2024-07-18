package customsorting;

import java.util.Comparator;

class SortEmployeeById implements Comparator<Employee>{

	@Override
	public int compare(Employee x, Employee y) {

		return x.id-y.id;  //Ascending order
	}

}

// x ->current obj to be inserted
// y ->already existing obj