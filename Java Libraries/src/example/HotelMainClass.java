package example;

class HotelMainClass {
	public static void main(String[] args) {
		Hotel h1=new Hotel("Taj",4.2);
		Hotel h2=new Hotel("ITC",4.4);

		Hotel[]h= {h1,h2};
		for(int i=0;i<h.length;i++) {

			System.out.println(h[i]);
		}

	}
}
