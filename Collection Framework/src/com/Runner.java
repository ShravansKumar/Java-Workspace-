package com;

import java.util.ArrayList;

class Runner {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);

		System.out.println(l);  //[10, 20, 30]
		l.add(1,55);
		System.out.println(l); //[10, 55, 20, 30]
		l.set(2, 77);
		System.out.println(l);  //[10, 55, 77, 30]

	}
}
