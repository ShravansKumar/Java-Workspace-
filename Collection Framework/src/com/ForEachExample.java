package com;

class ForEachExample {
	public static void main(String[] args) {
		int[]a= {10,20,30};
		for(int i:a) {
			System.out.println(i);

		}
		System.out.println("-------------");
		double[]marks= {78.1,34.2,74.2};
		for(double  x: marks) {
			System.out.println(x);
		}
		System.out.println("-----------------");
		String []fruits= {"Apple","Mango","Watermelon"};
		for(String fruit:fruits) {
			System.out.println(fruit);
		}

	}
}
