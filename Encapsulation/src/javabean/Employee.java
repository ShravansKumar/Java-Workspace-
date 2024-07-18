package javabean;

public class Employee {
	private int id;
	private String name;
	private double sal;


	public void setId(int id) {   //setter1
		this.id=id;
	}
	public void setName(String name) { //setter2
		this.name=name;
	}
	public void setSal(double sal) { //setter3
		this.sal=sal;

	}
	public int getId() {    //getter1
		return id;
	}
	public String getName() { //getter2
		return name;
	}
	public double getSal() { //getter3
		return sal;
	}
}
