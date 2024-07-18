package com;

class Country {
	String name;
	State state;

	Country(String name,State state){


		this.name=name;
		this.state=state;
	}
}

class State{


	String name;
	District district;



	State(String name, District district ){
		this.name= name;
		this.district=district;

	}
}

class District {

	String name;


	District(String name){
		this.name=name;

	}

}


class Runner {
	public static void main(String[] args) {

		{

			District district = new District("Bengaluru");

			State state = new State ("Karnataka",district);
			Country country = new Country("India",state);

			System.out.println(country.name);
			System.out.println(country.state.name);
			System.out.println(country.state.district.name);

		}
	}
}






















