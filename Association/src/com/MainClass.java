package com;

class College {
	String collegeName="XYZ";

	Student student=new Student();
}

class Student{

	String studentName="John";

}

class MainClass{
	public static void main (String[] args) {

		College college=new College();

		System.out.println("College name " +college.collegeName);
		System.out.println("Student name : " +college.student.studentName);

	}
}


