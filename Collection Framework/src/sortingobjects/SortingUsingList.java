package sortingobjects;

import java.util.ArrayList;
import java.util.Collections;

class SortingUsingList {
	public static void main(String[] args) {
		Car c1=new Car(490000);
		Car c2=new Car(800000);
		Car c3=new Car(590000);


		ArrayList <Car> l=new ArrayList<Car>();
		l.add(c1);
		l.add(c2);
		l.add(c3);

		Collections.sort(l);
		for(Car c :l) {
			System.out.println(c);
		}
	}
}
