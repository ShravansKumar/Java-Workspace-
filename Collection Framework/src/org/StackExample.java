package org;

import java.util.Stack;

class StackExample {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(10);  //add() can be also used
		s.push(20);
		s.push(30);

		for(int i:s) {
			System.out.println(i);

		}
		System.out.println("--------------");

		System.out.println(s.pop());  //remove() can also be used
		System.out.println(s.pop());
		System.out.println(s.pop());
		// System.out.println(s.pop()); -> EmptyStack Exception
	}
}
