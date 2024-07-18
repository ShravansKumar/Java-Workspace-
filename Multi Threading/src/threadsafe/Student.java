package threadsafe;


//thread
class Student extends Thread  {
	String name;
	String question;

	Trainer trainer;

	Student(String name,String question,Trainer trainer){


		this.name=name;
		this.question= question;
		this.trainer=trainer;


	}

	@Override
	public void run() {
		trainer.askQuestion(name, question);
	}
}
