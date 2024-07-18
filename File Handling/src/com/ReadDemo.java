package com;

import java.io.*;

class ReadDemo {
	public static void main(String[] args) {
		File f=new File("jspiders.txt");
		try {
			FileReader fr=new FileReader(f);
			int ch=fr.read();
			while(ch!=-1){
				System.out.print((char)ch);
				ch=fr.read();

			}	
		}

		catch(IOException r) {
			r.printStackTrace();
		}
	}
}
