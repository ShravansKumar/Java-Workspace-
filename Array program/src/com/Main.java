package com;

class Main {
	public static void main(String[] args) {
		int[]a= {10,20,5,15,20};


		for(int i=0;i<a.length;i++)
		{
			int sum=0;

			sum = sum+a[i];

			System.out.println("Sum: "+sum);

			double average =0;
			average=(sum /a.length);
			System.out.format("Average of Array Elements is" +average);
		}
	}
}
