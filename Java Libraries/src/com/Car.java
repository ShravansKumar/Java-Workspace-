package com;

class Car {
	int cost;
	Car(int cost){
		this.cost=cost;
	}
	@Override
	public String toString() {
		return "Total cost " +cost;

	}
	public static void main(String[] args) {
		Car c1=new Car(300);
		Car c2=new Car(400);
		System.out.println(c1);
		System.out.println(c2);
	}
}
