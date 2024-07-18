package org;

class Pen {
	String brand;

	Pen(String brand){
		this.brand=brand;

	}
	public boolean equals(Object obj) {
		Pen p=(Pen)obj;
		return this.brand.equals(p.brand);
	}

	public static void main(String[] args) {
		Pen p1 =new Pen("Lexi");
		Pen p2=new Pen("Camlin");
		System.out.println(p1.equals(p2));
		if(p1.equals(p2)) {
			System.out.println("pen brand is same");
		}
		else {
			System.out.println("Pen brand isnt same");
		}
	}
}




