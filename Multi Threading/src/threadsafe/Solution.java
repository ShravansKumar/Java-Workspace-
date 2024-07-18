package threadsafe;

class Solution {

	public static void main(String[] args) {
		//1 shared Resource


		Trainer t =new Trainer();

		//Multiple threads

		Student s1=new Student("Tom ","Inheritance",t);
		Student s2=new Student("John ","Polymorphism",t);
		Student s3=new Student("Smith ","Encapsulation",t);
		
		s1.start();
		s2.start();
		s3.start();
	}
}
