package rtp;

class Employee {
	void work() {
		System.out.println("Employee is working");
	}



}

class developer extends Employee{ //Rule 1
	@Override  //Rule 2
	void work() {
		System.out.println("Developing App");
	}
}
class Tester extends Employee{ //rule 1
	@Override  //Rule 2
	void work() {
		System.out.println("Testing app");
	}
}