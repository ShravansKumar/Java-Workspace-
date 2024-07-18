package org;


import java.util.*;

class Sorting {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList <Integer>();


		l.add(20);
		l.add(10);
		l.add(40);
		l.add(30);

		Collections.sort(l);
		System.out.println("Elements are :"+l);
		System.out.println("Smallest element :"+l.get(0));
		System.out.println("Largest Element :"+l.get(l.size()-1));


	}


}
;
