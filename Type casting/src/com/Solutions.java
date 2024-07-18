package com;

class Solutions {
	//Generalization

	//1.Father obj=new Son();
	//2.Father obj =new Daughter();
	static void display(Father obj) {
		if(obj instanceof Son ) {
			System.out.println("Downcasting to Son");
			Son s =(Son)obj;
			System.out.println(s.x +"  "+s.y);
		}
		else if(obj instanceof Daughter) {
			System.out.println("Downcasting to daughter");
			Daughter d =(Daughter)obj;
			System.out.println(d.x+" "+d.z);
		}
	}
	public static void main(String[] args) {
		display(new Son());
		System.out.println("----------------------");
		display(new Daughter());

	}
}
