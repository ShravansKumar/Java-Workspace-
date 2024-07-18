package org;

class Car {
	int cost;

	Car(int cost){
		this.cost=cost;
	}
	@Override
	public boolean equals(Object obj) {  //object obj =new Car(3000);

		Car c=(Car)obj;                    //Car c =(car)obj 
		return this.cost==c.cost;


	}
	public static void main(String[] args) {
		Car c1=new Car(3000);
		Car c2=new Car(2000);
		System.out.println(c1.equals(c2));


	}



}

