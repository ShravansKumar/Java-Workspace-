package org;

import java.util.*;

class Solution {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>(); //upcasting
		l.add(20);
		l.add(30);
		l.add(10);
		System.out.println(l); //[20,30,10]
		Collections.sort(l);
		System.out.println(l); //[10, 20, 30]
		Collections.reverse(l);
		System.out.println(l);//[30, 20, 10]
		
		
		System.out.println("-------------");
		
		List ll=new LinkedList(); //upcasting
		ll.add(10);
		ll.add(1.5);
		ll.add("Java");
		
		System.out.println(ll);
		Collections.reverse(ll);
		
		System.out.println(ll);
	}
	



	}

