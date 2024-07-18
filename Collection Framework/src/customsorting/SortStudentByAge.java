package customsorting;

import java.util.Comparator;

class SortStudentByAge implements Comparator<Student>{

	@Override
	public int compare(Student x,Student y) {
		return x.age-y.age;   //return x.age.compare(y.age);
	}

}


// x -> Current object to be inserted
// y -> Already existing object
// Ascending order -return x.age-y.age;
// Descending order - return y.age-x.age;