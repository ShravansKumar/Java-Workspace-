package com;

class MainClass {
	public static void main(String[] args) {
		Tom t=new Tom();
		t.setName("tom thread");

		t.start();//rule 3

		Jerry j= new Jerry();
		j.setName("jerry name");
		j.start(); //rule 3
	}
}
