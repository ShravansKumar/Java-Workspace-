package org;

class Demo {
	public static void main(String[] args) {

		Thread t1=new Thread();
		System.out.println(t1.getName()); //Thread-0
		t1.setName("car thread");
		System.out.println(t1.getName());//car Thread

		System.out.println("----------");

		//Thread name is initialized using constructor
		Thread t2=new Thread("bike thread");
		System.out.println(t2.getName()); //bike thread



	}

}
 