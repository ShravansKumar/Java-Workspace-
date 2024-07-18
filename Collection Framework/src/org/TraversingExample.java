package org;
import java.util.ArrayList;
import java.util.Iterator;



class TraversingExample {
	public static void main(String[] args) {
		ArrayList <Integer>l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);

		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("------------");

		for(Integer i:l) {
			System.out.println(i);
		}
		System.out.println("-------------");
		Iterator <Integer>i=l.iterator(); //getting the iterable obj address

		while(i.hasNext()) { //checks whether a object ia svailable in the next position or not
			System.out.println(i.next()); //return those objects
		}

	}


}
