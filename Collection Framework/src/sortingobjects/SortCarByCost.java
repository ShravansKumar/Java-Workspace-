package sortingobjects;

import java.util.Comparator;

class SortCarByCost implements Comparator<Car> {

	@Override
	public int compare(Car a, Car b) {

		return a.cost-b.cost;
	}



}
