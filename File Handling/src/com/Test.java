package com;

import java.io.File;

class Test {

	public static void main(String[] args) {
		
		File f=new File("d:/bike.txt"); //.docx,.xlsx,pdf
		
		try {
			
			// boolean result =f.createNewFilr();
			//System.out.println(result);
			System.out.println(f.createNewFile());
		}
		
		
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}
