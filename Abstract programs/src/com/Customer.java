package com;

class Customer extends Swiggy {
	@Override
	void orderfood() {
		System.out.println("Ordering Croissant");
	}
	void payAmount() {
		System.out.println("Pay the amount-> 217");
	}

	public static void main(String[] args) {
		Customer c =new Customer();
		c.orderfood();
		c.payAmount();
	}

}
