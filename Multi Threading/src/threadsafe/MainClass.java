package threadsafe;

public class MainClass {
public static void main(String[] args) {
	
	
	//1 shared resource
	
	Netflix n=new Netflix();
	
	
	//Multiple threads
	
	Person p1=new Person("Akhil",n);
	Person p2=new Person("David",n);
	Person p3=new Person("Luna",n);
	
	
	p1.start();
	p2.start();
	p3.start();
	
	
	
	
}
}
