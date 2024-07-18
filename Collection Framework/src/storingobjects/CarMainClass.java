package storingobjects;

import java.util.ArrayList;

class CarMainClass {
	public static void main(String[] args) {
		Car c1=new Car(2000);
		Car c2=new Car(4000);
		ArrayList<Car> l=new ArrayList<Car>();
		l.add(c1); //l.add(new Car(2000));

		l.add(c2); //l.add(new Car(4000);


		//If toString() is Overridden
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));//printing reference variable 
			//c1 and c2 -> calls toString()
		}
		System.out.println("-------------");

		for(Car c :l) {
			System.out.println(c);


		}
		System.out.println("------------------");
		//If toString() is not overridden
		for(int i=0;i<l.size();i++) {
			System.out.println("Cost :"+l.get(i).cost);

		}

		System.out.println("-------------------");

		for(Car c :l) {
			System.out.println("Cost :"+c.cost);

		}



	}
}
