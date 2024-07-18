package defaultsorting;

import java.util.TreeSet;

class StudentMainClass {
	public static void main(String[] args) {
		Student s1=new Student(20);
		Student s2=new Student(21);
		Student s3 =new Student(19);

		TreeSet<Student> t=new TreeSet<Student>();
		t.add(s1);
		t.add(s2);
		t.add(s3);

		for(Student std :t) {
			System.out.println(std);
		}

	}
}
