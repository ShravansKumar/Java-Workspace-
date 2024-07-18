package com;

import java.io.File;
import java.util.Date;

class Solution {

	public static void main(String[] args) {

		//Specifying the file name
		File f=new File("car.txt");

		//getting milliseconds value of when file was last modified
		long milliseconds=f.lastModified();

		//Converting milliseconds value into Date format
		Date d=new Date(milliseconds);

		//Printing reference variable as toString() is Overriden
		System.out.println( d);

		System.out.println("--------------------");

		File f1=new File("car.txt");
		Date d1=new Date(f1.lastModified());
		System.out.println(d1);

		System.out.println("-------------");


		Date d2=new Date(new File("car.txt").lastModified());
		System.out.println(d2);


		System.out.println("----------------");


		System.out.println(new Date(new File("car.txt").lastModified()));



	}
}
