package org;

class Car {
	int cost;
	String name;


	Car (int cost){
		this.cost=cost;		
	}
	Car(int cost ,String name){
		this(cost);
		this.name=name;

	}
	public static void main(String[] args) {
		Car c=new Car(100,"Audi");
		System.out.println("Cost" +c.cost);
		System.out.println("Brand"+c.name);

	}
}
