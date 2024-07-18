package com;

class BankImpl implements Bank{
	int balance;
	BankImpl(int balance){
		this.balance=balance;

	}
	@Override
	public void deposit(int amount)
	{
		System.out.println("Depositing amount :" +amount);
		balance +=amount; //balance =balance +amount(assignment operator)
		System.out.println("Amount is deposited succesfully ");
	}
	@Override
	public void withdraw(int amount) {
		System.out.println("Withdrawing amount :"+amount);
		balance -=amount;
		System.out.println("Amount withdrawn Sucessfully ");
	}
	@Override
	public void checkBalance() {
		System.out.println("Available balance rs."+balance);


	}

}
