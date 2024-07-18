package com;

import java.util.Scanner;

class Hotel  {

	/**
	 * Factory design pattern
	 * A method retutning diff types of objects is called -Factory design Pattern
	 * We achieve Factory design pattern with the help of Generalization (upcasting)
	 * if the return type is biriyani,method can return only Biriyani object(Specialization)
	 * Therefore if the return type is Food,It can return Pizza object or Icecfeam object or Biriyani object (generalization).

	 */
	static Food orderFood(int choice) 
	{
		if(choice == 1) {  //comparing value -(==)

			Pizza p=new Pizza();

			return p; //return new Pizza();

		}
		else if (choice==2) {
			Icecream ic=new Icecream();
			return ic; //return new Icecream();


		}

		else if (choice==3)
		{

			Biriyani b =new Biriyani();
			return b;  //return new Biriyani():



		}
		else {
			return null;
		}


	}
	public static void main(String[] args) {


		//if order food(1);-.Food obj =new Pizza();
		//if order food(2);-.Food obj =new Icecream();
		//if order food(3);-.Food obj =new Biriyani();
		//if order food(4..5..n);-.Food obj =null;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice");
		int c=scan.nextInt();
		Food obj =orderFood(c);
	
		
		if(obj instanceof Pizza) {
			System.out.println("Eating pizza");
		}
		else if(obj instanceof Icecream) {
			System.out.println("Eating Icecream");
		}
		else if(obj instanceof Biriyani) {
			System.out.println("Eating Biriyani");
		}
		else {
			System.out.println("Invalid Sorry out of stock");
		}
	}


}


