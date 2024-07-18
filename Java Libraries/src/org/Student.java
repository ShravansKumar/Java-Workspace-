package org;

class Student {
	int age;

	Student(int age){
		this.age=age;
	}

	@Override
	public boolean equals(Object obj) { //Object obj=new Student(20);
		Student s= (Student)obj;    //downcasting
		return this.age == s.age;	  //s1.age=s2.age;
	}

	public static void main(String[] args) {
		Student s1=new Student(20);
		Student s2=new Student(20);
		
		System.out.println(s1.equals(s2));  //s1.equals(new Student(20));

	}
}
//s1->this
//s2->obj(upcasted reference) ->(downcasted reference)