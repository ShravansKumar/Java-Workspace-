package sortingobjects;

class Car implements Comparable<Car> {
	int cost;

	Car(int cost){
		this.cost=cost;
	}
	public String toString() {
		return "Cost of the car :"+ cost;

	}
	@Override
	public int compareTo(Car c) {

		return this.cost-c.cost;
	}
}
