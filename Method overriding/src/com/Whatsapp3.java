package com;

class Whatsapp3 extends Whatsapp2 {
	void sendMessage() {
		super.sendMessage();
		System.out.println("Blue tick is supported");

	}
	void story() {
		super.story();
		System.out.println("Videos are also added");
	}
	void payment() {
		System.out.println("Payment mode is enabled");
	}


}
