package com;

class Netflix {
	static void login(String email,int password) {
		System.out.println(" succesfully Logged in using email and password");
	}
	static void login(int contactNo,int otp) {
		System.out.println("succesfully logeed in using contact number and otp");

	}
	public static void main(String[] args) {

		Netflix.login(987657,1234 ); //login(987656,1234);
		System.out.println("------");
		Netflix.login("shravan.universe@gmail.com",123); //login
	}
}