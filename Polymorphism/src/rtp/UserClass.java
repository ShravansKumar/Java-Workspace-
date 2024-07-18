package rtp;

class UserClass {
	static void payment(PaymentGateway obj) { //static cause we need not create an obj  //generalization
		obj.pay();  //Method calling

	}
	public static void main(String[] args) {
		payment(new Paytm());    //upcasting first subclass
		payment(new Phonepe());  //upcasting second subclass
		payment(new Googlepay());  //upcasting third subclass
	}

}
