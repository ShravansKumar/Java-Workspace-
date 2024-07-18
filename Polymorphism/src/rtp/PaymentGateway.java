package rtp;

class PaymentGateway {
	void pay() {
		System.out.println("Paying aamount");
	}

}
class Paytm extends PaymentGateway{
	@Override
	void pay() {
		System.out.println("Payment 500$ done using Paytm");
	}
}
class Phonepe extends PaymentGateway{  //Rule 1
	@Override  //Rule2
	void pay() {
		System.out.println("Payment 500$  done using Phonepe");


	}
}
class Googlepay extends PaymentGateway{
	@Override
	void pay() {
		System.out.println("Payment 500$ done using Google pay");
	}
}
