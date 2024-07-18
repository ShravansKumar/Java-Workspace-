package com;

import java.io.*;

class WriteExample {
	public static void main(String[] args)throws Exception {
		File f=new File("jspiders.txt");
		FileWriter fw=new FileWriter(f,true);//append
		fw.write("Studying Java");
		fw.flush();
		fw.close();
		System.out.println("Data entered Sucessfully !");

	}
}
 