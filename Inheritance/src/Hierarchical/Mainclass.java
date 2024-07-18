package Hierarchical;

class Mainclass {
	public static void main(String[] args) {
		Car c =new Car();
		System.out.println(c.brand+"  "+c.brand);
		c.start();
		Bike b =new Bike();
		System.out.println(b.brand+ "  "+b.cost);
		b.stop();
	}
}
