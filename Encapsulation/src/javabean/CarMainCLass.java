package javabean;

public class CarMainCLass {
	public static void main(String[] args) {
		Car c =new Car();

		c.setCost(400);

	     int cost=c.getCost();
	     
		System.out.println("Cost :"+c.getCost());
	}

}