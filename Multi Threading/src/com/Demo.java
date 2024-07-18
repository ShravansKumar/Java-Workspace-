package com;

class Demo {
	public static void main(String[] args) {


		Thread t =new Thread();

		System.out.println("Thread Id :"+ t.getId());
		System.out.println("Thread Name :"+ t.getName());
		System.out.println("Thread Priority :"+ t.getPriority());



		System.out.println("--------------------");
		t.setName("Valiban thread");
		t.setPriority(8);


		System.out.println("Thread Id :"+ t.getId());
		System.out.println("Thread Id :"+ t.getName());
		System.out.println("Thread Id :"+ t.getPriority());

	}

}
