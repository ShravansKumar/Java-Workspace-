package com;

import java.io.File;

class Runner {
public static void main(String[] args) {
	
	File f =new File("Employee");
	if(f.exists()) {
		f.delete();
		System.out.println("File deleted successfully");
		
		
		
	}
	
	else {
		System.out.println("File not found");
	}
}
}
