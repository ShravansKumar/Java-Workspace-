package ctp;

class Customer {
	public static void main(String[] args) {
		Amazon a =new Amazon();
		a.purchase("Shravan",2000);
		a.purchase("Alvin");
		a.purchase(3500,"Adarsh");
		a.purchase(5000);
	}
}
