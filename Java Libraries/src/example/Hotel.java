package example;

class Hotel {
	String name;
	double rating;

	Hotel(String name,double rating){
		this.name=name;
		this.rating=rating;

	}
	@Override
	public String toString() {
		return name+"Hotel has a rating of"+rating;
	}
}
