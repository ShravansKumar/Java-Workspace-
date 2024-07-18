package org;

class Employee {
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;

	}
	@Override //Object obj =new Employee(100,"tom");
	public boolean equals(Object obj) { //1.uupcasting
		Employee emp=(Employee)obj;   //2.downcasting
		return this.id ==emp.id && this.name.equals(emp.name); //3.cl


	}

}
 
/**
1.For string comparison,dont use ==,kindy use equals()
2.In the above pgm,upcasting is achieved only when call/ invoke equals();
3.[e1->this] and [e2 ->Obj ->emp]
*/