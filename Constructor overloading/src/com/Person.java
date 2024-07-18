package com;

class Person {
	Person(int age){
		System.out.println("age of the person is"+age);


	}
	Person(String name){
		System.out.println("Name of the person "+name);

	}

	Person(double height){
		System.out.println("height of the person is " +height);


	}

	Person(int age,String name){
		System.out.println("Age is " +age +"  "+ "Name " + name);

	}
	public static void main(String[] args) {
		Person p=new Person(23);
		new Person(24,"Shravan");
		new Person(5.7);
		new Person("Akhila");



	}


}
