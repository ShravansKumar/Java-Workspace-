package defaultsorting;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	Double sal; //Wrapper class Declaration to call compareTo()

	Employee(int id ,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}



	@Override
	public String toString() {
		return "ID: " +id +" Name :"+ name +" Salary: " + sal;

	}
	@Override
	public int compareTo(Employee emp) {
		return this.sal.compareTo(emp.sal);
	}


}
/**
 * this ->Current object to be inserted
 * e ->Already existing object
 * 
 * 1.Sorting based on id(int);
 *     -Ascending order ->return this.id -emp.id;
 *     -Descending order ->return emp.id-this.id;
 *     
 *  2.Sorting based on name(String);
 *     -Ascending order ->return this.name.compareTo(emp.name);
 *     -Descending order ->return emp.name.compareTo(this.name);
 *     
 *     
 *  3.Sorting based on salary(Double);
 *    -Ascending order ->return this.sal.compareTo(emp.sal);
 *    - Descending order ->return emp.sal.compareTo(this.sal);
 *    
 */


