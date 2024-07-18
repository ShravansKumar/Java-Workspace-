package com;

import java.util.ArrayList;

class Demo {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(1.5);
		l.add(10);
		l.add("Java");
		l.add(null);

		System.out.println(l); //[10, 1.5, 10, Java, null]
		System.out.println(l.get(1));//1.5
		System.out.println(l.size()); // 5

		System.out.println("-----------------");
		System.out.println(l.contains("java")); //false

		System.out.println(l); 
		l.remove(1);

		System.out.println(l);  //[10, 10, Java, null]

		System.out.println(l.isEmpty());  //false
		l.clear();

		System.out.println(l.isEmpty()); //true
	}

}
