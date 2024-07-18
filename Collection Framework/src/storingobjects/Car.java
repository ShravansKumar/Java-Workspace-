package storingobjects;

class Car {
	int cost;
	Car(int cost){
		this.cost=cost;
	}

	@Override
	public String toString() {
		return "Cost:"+cost;

	}
}
