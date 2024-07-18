package example;

class Person {
	double height ;
	String name;
	Person(String name,double height){
		this.name=name;
		this.height=height;
	}
  @Override
	public boolean equals( Object obj) {  //upcasting
		Person p=(Person)obj;            //downcasting
		return this.height==p.height;    //comparisom logic
	}
}
