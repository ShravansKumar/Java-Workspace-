package com;

import java.util.ArrayList;

class Test {
	public static void main(String[] args) {
		//Internally an array gets created based on the size of 
		//default iitial capacity (10)
		ArrayList a =new ArrayList();
		//Internally an array gets created based on the size of
		//custom initial Capacity(50)

		ArrayList b=new ArrayList(50);
		ArrayList x=new ArrayList();
		x.add(10);
		x.add(20);
		//adding 1 collection into another collection
		ArrayList y=new ArrayList(x);
		y.add(30);

		System.out.println(x); //[10,20]
		System.out.println(y); //[10,20,30]

	}
}
