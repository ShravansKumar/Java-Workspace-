package defaultsorting;

import java.util.TreeSet;

class PersonMainClass {

	public static void main(String[] args) {
		Person p1=new Person("Jack");
		Person p2=new Person ("Jones");
		Person p3=new Person("Birkenstock");

		TreeSet<Person> t=new TreeSet<Person>();
		t.add(p1);
		t.add(p2);
		t.add(p3);

		for(Person p:t) {
			System.out.println(p);
		}
	}
}
