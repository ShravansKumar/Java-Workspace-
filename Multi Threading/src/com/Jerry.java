package com;

class Jerry extends Thread{

	@Override
	public void run() {
		for(int j=6;j<=10;j++) {
			System.out.println(j);


		
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e ){
			e.printStackTrace();
		}
	}
	}

}
