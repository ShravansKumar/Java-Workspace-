package primitivecasting;

class Demo {
	public static void main(String[] args) {
		//widening
		int a =25;
		double b =a;
		System.out.println(a +""+b); //25 25.0

		double c=17;
		System.out.println(c); //17.0

		char i='A';
		int j=i;
		System.out.println(i+" "+j); //A 65 
		System.out.println("-----");


		//Narrowing
		double x=34.7;
		int y=(int)23.9;
		System.out.println(x+" " +y); //34.7 34

		int z =(int)23.9;
		System.out.println(z); //23

		int p=68;
		char q =(char) p;
		System.out.println(p+""+q); //68 d

		System.out.println("--------");

		System.out.println((int)89.23);  //89
		System.out.println(( char)98); //b
		System.out.println("A" +"B");  //AB
		System.out.println("A"+10); //A10
		System.out.println(20 +"B"); //20B
		System.out.println("A"+10+20); //A1020
		System.out.println(10+50+"C"); //60C
		System.out.println('A'+'B'); //131
		System.out.println('a'+20);  //117


	}
}
