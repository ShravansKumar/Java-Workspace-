package threadsafe;


//Shared Resource
public class Trainer {

	
	synchronized void askQuestion( String name,String question) {
		System.out.println(name +" is asking what is "+question);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(name+"got the answer !!\n------");
	}
}
