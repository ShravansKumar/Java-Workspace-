package com;

public class Tom implements Gpay{
	@Override
	public void bookRide() {
		System.out.println("Booked a Ride");
	}

	public void payAmount(int amount) {
		System.out.println("Payed the amount ");
	}
	public static void main(String[] args) {
		Tom t =new Tom();
		t.bookRide();
		t.payAmount(350);



	}

}
