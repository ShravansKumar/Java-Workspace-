package com;

class Tom extends Thread {//rule 1


	@Override //rule 2
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);


			try {
				Thread.sleep(2000);
			}

			catch(InterruptedException e ) {
				e.printStackTrace();
			}
		}
	}


}
