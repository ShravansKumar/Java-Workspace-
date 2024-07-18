package sortingobjects;

class Student implements Comparable<Student> {
	int age;
	String name;
	Student(int age,String name){
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return name +" is "+age +" years old";

	}
	@Override
	public int compareTo(Student s){
		return this.age-s.age;

	}
}
