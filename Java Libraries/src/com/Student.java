package com;

class Student {
	int age;
	Student(int age){
		this.age=age;
	}
	@Override
	public String toString() {
		return "Age: " +this.age;   //return "AGE : " + age;
	}
	public static void main(String[] args) {
		Student s =new Student(20);
		System.out.println(s);
		System.out.println(s.toString());
	}
}
