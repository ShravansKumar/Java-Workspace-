package com;

class StudentMainClass {


	static void findHighestMarks(Student s1,Student s2) {
		//Define a logic to print the name of the student with highest marks
		if(s1.marks>s2.marks) {
			System.out.println(s1.name+" has the highest marks");

		}
		else if(s1.marks<s2.marks) {
			System.out.println(s2.name +" has the lowest marks");
		}
		else {
			System.out.println(" Both students have same marks");
		}
	}


	public static void main(String[] args) {

		Student s1 =new Student("Ajith",90);
		Student s2 = new Student("keerthan",87);
		findHighestMarks(s1,s2);
		findHighestMarks(new Student ("Ajith",90),new Student("Keerthan",87));

	}



}
