package com;

import java.util.*;

class GenericsDemo {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		for(Integer i:al) {//for(int i :al){
			System.out.println(i);
		}
		System.out.println("-------");

		LinkedList<Double> ll =new LinkedList<Double> ();
		ll.add(10.5);
		ll.add(13.7);
		ll.add(12.1);
		for(Double x:ll) { //for(double x :ll){
			System.out.println(x);
		}
		System.out.println("----------");
		ArrayList l=new ArrayList();
		l.add(10);  //l.add(new Integer(10));

		l.add(10.5); //l.add(new Double(1.5));
		/**
		 * Generalization or upcasting
		 * Object obj =new Integer(10);
		 * Object obj=new Double (10.5);
		 * 
		 */
		for(Object obj :l) {
			System.out.println(obj);
		}


	}
}
