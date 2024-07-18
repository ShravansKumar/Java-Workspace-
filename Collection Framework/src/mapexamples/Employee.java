package mapexamples;

class Employee implements Comparable <Employee>{
	int id;
	Employee(int id){
		this.id=id;

	}

	public String toString() {
		return ""+ id;

	}
	public int compareTo(Employee emp) {
		return this.id-emp.id;
	}

}

