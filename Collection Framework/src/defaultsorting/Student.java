package defaultsorting;

class Student implements Comparable<Student>{
	int age;

	Student(int age){
		this.age=age;

	}
	@Override
	public String toString() {
		return "Age:"+age;
	}

	@Override
	public int compareTo(Student s) {
		return this.age-s.age;
	}
}

//this ->Current object to be inserted
//s->Already existing Object
//Ascending order -> return this.age-s.age;
//Descending order -> return  s.age-this.age;

