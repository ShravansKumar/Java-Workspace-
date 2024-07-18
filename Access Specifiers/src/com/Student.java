package com;

//Accessing public members in same class
public class Student {
	public int age=20;
	public static String name="Tom";
	public void study()

	{
		System.out.println("Studying java");
	}

	public static void main(String[] args) {
		System.out.println("Name : " + name);
		Student s= new Student();

		System.out.println("Age :"+s.age);

		s.study();

	}

}
