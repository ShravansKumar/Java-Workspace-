package com;

class demo {
	public static void main(String[] args) {
		//array declaration
		int[]a;
		//array creation
		a=new int[3];
		//printing array elements
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("-----");

		//array initialization
		a[0]=15;
		a[2]=25;

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		System.out.println("----");

		//array declaration and creation
		double[]marks=new double[2];
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println("----");

		marks[0]=67.2;
		marks[1]=97.2;
		System.out.println(marks[0]);
		System.out.println(marks[1]);


	}
}
