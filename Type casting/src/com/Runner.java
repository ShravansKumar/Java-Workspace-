package com;

class Runner {
	//Generalization or Upcasting
	//Employee obi=new developer()or new Tester ();
	static void display(Employee obj) {
		if(obj instanceof Developer) {
			Developer d = (Developer )obj;
			System.out.println("Name :"+d.name);
			d.developApp();
		}
		else if(obj instanceof Tester) {

			Tester t =(Tester)obj;
			System.out.println("Name :"+t.name);
			t.testApp();

		}
	}
	public static void main(String[] args) {
		display(new Developer());
		System.out.println("---------");
		display(new Tester());

	}
}   
