package pp;

class Cloth implements Comparable<Cloth> {
	String  color;


	Cloth(String color){
		this.color=color;

	}

	public String toString() {
		return " "+color;

	}

	@Override
	public int compareTo(Cloth c) {

		return this.color.compareTo(c.color)  ;
	}


}
