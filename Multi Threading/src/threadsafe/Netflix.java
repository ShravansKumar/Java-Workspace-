package threadsafe;


//Shared resource
class Netflix {

	synchronized void watchMovie(String name) {


		System.out.println(name+ "  watching movie");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(name +" done watching movie\n-----------");
	}



}
