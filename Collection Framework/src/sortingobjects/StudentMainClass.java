package sortingobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

class StudentMainClass {

	public static void main(String[] args) {
		Student s1=new Student(23,"Tom");
		Student s2=new Student(22,"James");
		Student s3=new Student(20,"Hooper");
		TreeSet<Student>t=new TreeSet<Student>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		for(Student s:t) {
			System.out.println(s);

		}

		System.out.println("-------------------------------");
		ArrayList<Student>l=new ArrayList<Student>();

		l.add(s1);
		l.add(s2);
		l.add(s3);
		Collections.sort(l);

		for(Student s :l) {
			System.out.println(s);
		}

	}

	/*
	 * If objects aren't comparable in nature:
	 * 
	 *   1.Treeset throws ClasscastException.
	 * 
	 *   2.sort() give compile time error
	 * 
	 * 
	 */

}
