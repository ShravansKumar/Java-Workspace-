package org;
import com.Car;
//Accessing public members in different class,different package
public class Mainclass {
	public static void main(String[] args) {
		Car c =new Car();
		System.out.println("Cost :" +Car.cost);

		System.out.println("Brand :"+c.brand);
		System.out.println("Color: "+c.color);
		Car.start();
	}

}
