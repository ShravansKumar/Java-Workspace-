package com;

class CalculatorImpl implements Calculator{
	@Override
	public void add (int x ,int y) {
		int sum =x+y;

		System.out.println("Sum of"+x +"&"+y +"is" +sum);
	}
	@Override
	public void sub(int x,int y) {
		System.out.println("Difference of "+x +"&"+y +"is"+(x-y));

	}
	@Override
	public void mul(int x,int y) {
		System.out.println("Product of "+x +"&"+y +(x*y));
	}
	@Override
	public void div(int x,int y) {
		System.out.println("Division of"+x+"&"+y+(x/y));


	}

}
