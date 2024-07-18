package sortingobjects;

import java.util.ArrayList;
import java.util.TreeSet;

class SortingCarUsingTreeSet {
	public static void main(String[] args) {
		Car c1=new Car(490000);
		Car c2=new Car(800000);
		Car c3=new Car(590000);


		TreeSet <Car> t=new TreeSet<Car>();
		t.add(c1);
		t.add(c2);
		t.add(c3);

		for(Car c :t) {
			System.out.println(c);
		}
	}
}

