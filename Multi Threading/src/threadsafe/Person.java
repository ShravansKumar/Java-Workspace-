package threadsafe;

class Person extends Thread{

	
	String name;
	Netflix netflix;
	
	
	Person(String name,Netflix netflix){
		this.name=name;
		
		this.netflix=netflix;
		
		
		
	}
	
	@Override
	
	public void run() {
		netflix.watchMovie(name);
		
	}
	
	
}
