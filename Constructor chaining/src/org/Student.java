package org;

class Student {
	int age; //20
	String name; //Tom

	Student(int age){
		this.age=age;
	}
	Student(int age,String name){
		this(age); //this(20); //this.age=age;
		this.name=name;

	}
	public static void main(String[] args) {
		Student s=new Student(20,"Tom");
		System.out.println("Age"+s.age);
		System.out.println("Name"+s.name);

	}

}
