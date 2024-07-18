package example;

class PersonSolution {
	public static void main(String[] args) {
		Person p1=new Person("Tom",5.1);
		Person p2=new Person("Alex",6.5);

		if(p1.equals(p2)) {
			System.out.println(p1.name+" & "+p2.name+" have same height");
		}
		else {
			System.out.println(p1.name+" & "+p2.name +" have different height");
		}
	}
}
