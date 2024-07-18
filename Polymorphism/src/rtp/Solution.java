package rtp;

class Solution {
	//Generalization
	//Display(new developer()); ->Employee obj=new developer();
	//display(new Tester());  -> Employee obj=new Tester();
	static void display (Employee obj) {
		obj.work();
	}
	public static void main(String[] args) {
		//1.Upcasting using method(Generalization)
		display(new developer());
		display(new Tester());

		System.out.println("-----------------------------");

		//2.Upcasting using single reference variable
		Employee emp;
		emp = new developer();  //rule 3
		emp.work();

		emp =new Tester();  //rule 3
		emp.work();

		System.out.println("-------");

		//Upcasting using seperate reference variable
		Employee e1=new developer();  //rule 3
		e1.work();
		Employee e2=new Tester(); //rule3
		e2.work();

	}
}
