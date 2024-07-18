package storingobjects;

class StudentMainClass {


	public static void main(String[] args) {
		Student s1=new Student(21,"Sahala");
		Student s2=new Student(23,"alvin");

		Student[] std={s1,s2};


		for(int i=0;i<std.length;i++) {
			System.out.println(std[i].age +" " +std[i].name);

		}


	}
}
