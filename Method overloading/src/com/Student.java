package com;

class Student {


	void display(int age) {
		System.out.println("Age:"+age);
	}

	void display(String name)
	{
		System.out.println("Name:"+name);
	}
	void display(String name,int marks) {
		System.out.println("Name"+name+" Marks :" +marks);

	}
	void display(int marks,String name) {
		System.out.println("Marks:"+marks+"  Name:"+name);

	}
}

