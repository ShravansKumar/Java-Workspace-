package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class WriteDemo {
	public static void main(String[] args) {

		File f=new File("employee.txt");
		try {
			FileWriter fw=new FileWriter(f);
			fw.write("Hello World");
			fw.flush();
			fw.close();
			System.out.println("Data Stored");
		} 
		catch(IOException e){
			e.printStackTrace();
		}


	}
}
