package com;
class Tom extends Person{

	@Override
	void eat() {
		System.out.println("Tom is eating biriyani !");
	}
	public static void main(String[] args) {
		Tom t=new Tom();
		t.eat();

	}
}
