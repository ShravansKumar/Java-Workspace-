package ctp;

class Amazon {

	void purchase(String name) {
		System.out.println("Name :"+name);
	}
	void purchase(int cost) {
		System.out.println("Cost"+cost);
	}

	void purchase(String name,int cost) {
		System.out.println("Name :"+name+" Cost: "+cost);

	}
	void purchase(int cost,String name) {
		System.out.println("Cost :"+ cost+"Name: "+name);
	}
}
