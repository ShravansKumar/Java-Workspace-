package org;

class MainClass {
	public static void main(String[] args) {


		//Runnable type of obj  //
		Amazon obj=new Amazon();


		//converting runnable type to Thread type //rule 3
		Thread t =new Thread(obj);


		//setting or initializing thread name
		t.setName("amazon Thread");

		//calling start
		t.start();   //rule 4

		Thread t1=new Thread(new Amazon());

		t1.setName("amazon Thread");
		t1.start();


		Thread t2=new Thread(new Amazon(),"amazon Thread");
		t2.start();



		new Thread(new Amazon(),"amzon Thread").start();
	}

}
