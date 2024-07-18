package com;

import java.io.File;

class Demo {

	public static void main(String[] args) {


		//Folder gets created within the project
		//File f=new File("car");

		//Folder gets created within the d drive
		//FIle f=new file("d:/car");

		//object representation of a file name or folder name



		File f=new File("Employee");

		boolean result=f.mkdir();
		System.out.println(result); //System.out.println(f.mkdir());
	}
}

