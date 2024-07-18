package com;

import java.io.File;



class MainClass {
	public static void main(String[] args) {
		
	
	File f1=new File("Employee");
	File f2=new File("Student");
	System.out.println(f1.renameTo(f2));
}
}
