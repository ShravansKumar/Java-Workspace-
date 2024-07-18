package com;

public class MainClass {
	public static void main(String[] args) {
		Developer d=new Developer();
		d.work();

		System.out.println("-------------------");
		Tester t=new Tester ();
		t.work();
	}

}
