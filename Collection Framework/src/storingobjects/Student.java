package storingobjects;

class Student {
	int marks;
	String name;
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;

	}

	@Override
	public String toString() {
		return name+"has scored "+ marks +" Marks";
	}
}
