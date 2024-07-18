package org;

import java.util.Iterator;
import java.util.LinkedList;

class Runner {
	public static void main(String[] args) {
		LinkedList<String>l=new LinkedList<String>();
		l.add("Adithya");
		l.add("Devika");
		l.add("Malavika");

		Iterator<String>i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
