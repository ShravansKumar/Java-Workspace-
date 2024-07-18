package example;

class Employee {
	int id;
	String name;
	Employee(int id,String name){
		this.name=name;
		this.id =id;
	}
	public String toString() {
		return "Emp Id of"+" "+name+" "+"is "+id;
	}
}
