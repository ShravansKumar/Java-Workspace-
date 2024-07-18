package defaultsorting;

class Person implements Comparable<Person>{
	String name;

	Person(String name){
		this.name=name;

	}
	@Override
	public String toString() {
		return "Name :"+ name;

	}
	@Override
	public int compareTo(Person p) {
		return this.name.compareTo(p.name);   //to compare string objects
	}
}



//this ->Current obj to be inserted
//p -> Already existing obj
//Ascending order ->return this.name.compareTo(p.name);
//Descending order  -> return p.name.compareTo(this.name);