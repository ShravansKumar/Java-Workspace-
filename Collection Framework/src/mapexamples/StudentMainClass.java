package mapexamples;

import java.util.LinkedHashMap;
import java.util.Set;

class StudentMainClass {
	public static void main(String[] args) {
		Student s1=new Student (21); //map.put(new Student (21),"Tom");
		Student s2=new Student(22);  //map.put(new Student (22),"John");


		LinkedHashMap<Student,String> m =new LinkedHashMap<Student,String>();
		m.put(s1,"Tom");
		m.put(s2, "John");


		Set<Student> keys=m.keySet(); //s1 s2

		for(Student key:keys) {
			System.out.println(key +"  Name :"+m.get(key));
		}

	}
}
