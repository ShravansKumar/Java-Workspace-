package storingobjects;

import java.util.LinkedList;

class StudentMainClass {
	public static void main(String[] args) {
		Student s1=new Student("Tom ",60);
		Student s2=new Student("Alvin ",75);
		Student s3=new Student ("Devika ",80);


		LinkedList <Student>ll=new LinkedList<Student>();  //generics Student

		ll.add(s1);
		ll.add(s2);
		ll.add(s3);

		for(Student s :ll) {
			System.out.println(s);
		}


	}
}
