package javabean;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(12);
		emp.setSal(200);
		emp.setName("Shravan");
		System.out.println( "ID:"+emp.getId() +"  "+ "Name :"+emp.getName()+"  "+"Salary :"+emp.getSal());
	}
}
